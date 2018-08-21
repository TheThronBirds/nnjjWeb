import { Component, OnInit, Input, SimpleChanges, OnChanges } from '@angular/core';
import { tableinfo } from './domain/tableinfo.module';
import { AffiliatedCorpService } from './affiliated-corp.service';
import { Response } from '@angular/http';
import {DialogModule} from 'primeng/dialog';
import { BaseModel, BaseSearchModel, Base } from '@yh-frond-frameworks/biz-common';
import { ButtonService } from '@yh-frond-frameworks/biz-common/button/button.service';


import { tablefieldinfo } from './domain/tablefileldinfo.module';
import { tabledetails } from './domain/tabledetails';
import { tableName } from './domain/tableName';
import { ActivatedRoute,Router,NavigationEnd } from '@angular/router';
import { tablesearch } from './domain/tablesearch';
@Component({
  selector: 'app-affiliated-corp',
  templateUrl: './affiliated-corp.component.html',
  styleUrls: ['./affiliated-corp.component.css']
})
export class AffiliatedCorpComponent extends Base<BaseModel, BaseSearchModel> implements OnInit,OnChanges {
  

  @Input() table: tableName = null;
  @Input() tablesearch: tablesearch = null;
  affs: tableinfo[];

  tables:tabledetails[];

  tabledetail: tabledetails;
  private tableName?: String;
  display1: boolean = false;//用于控制枚举弹窗
  display2: boolean = false;//用于控制外部数据来源弹窗
  message: String;
  tfinfo: tablefieldinfo;
  maindisplay: boolean = true;
  maindisplay1: boolean = true;

  CacheTableName:String = null;
  CacheName:String = null;

  constructor(public buttonService?: ButtonService,public affiliatedCorpService?: AffiliatedCorpService,
    public route?: ActivatedRoute) { super(); }

  ngOnChanges(changes: SimpleChanges): void {
    this.maindisplay = true;
    for(let propName in changes){
      //查询表变化
      if(propName == "table"){
        console.log("进入变化函数" + this.table.tableName);
        if(this.table == undefined){
          return;
        }
         console.log("有变化" + this.table.tableName);
         console.log(this.table);
         //获取表字段信息
         this.affiliatedCorpService.query(this.table.tableName).subscribe((res: Response) => {
          let body = JSON.parse(res['_body']);
          if (body['yhRspType'] == 'ERROR') {
    
          } else {
            let data = res.json().data;
            this.affs = null;
            this.affs = data;
    
          }
    
        }, (res: Response) => {
          this.showMsg("连接服务器异常" + '!', 'info');
        });
    
        //获取表信息
        this.affiliatedCorpService.queryTable(this.table.tableName).subscribe((res: Response)=>{
          let body = JSON.parse(res['_body']);
          this.tabledetail = null;
          if (body['yhRspType'] == 'ERROR') {
    
          } else {
            let data = res.json().data;
            if(data == null){
              this.tabledetail = new tabledetails(this.table.tableName);
            }else{
              this.tabledetail = data;
            }
            
            
          }
    
        }, (res: Response) => {
          this.showMsg("连接服务器异常" + '!', 'info');
        });
        this.maindisplay1 = true;  
      }else if(propName == "tablesearch"){
            //查询数据库表
          if(this.tablesearch.selectType == 1){
            this.affiliatedCorpService.searchtable(this.tablesearch.searchName,this.tablesearch.searchTag).subscribe((res: Response)=>{
              let body = JSON.parse(res['_body']);
              if (body['yhRspType'] == 'ERROR') {
        
              } else {
                let data = res.json().data;
                
                  console.log("查询成功" + res.json());
                  this.tables = data;
                }
                
              
        
            }, (res: Response) => {
              this.showMsg("连接服务器异常" + '!', 'info');
            });
          }
          this.maindisplay1 = false;
      
    }
    
      
  }}


  ngOnDestroy(){
    console.log("组件销毁");
  }

  

  ngOnInit() {
    this.maindisplay = false;
    this.buttons = [];
    this.route.params.subscribe((data)=>this.tableName=data.tableName);
    console.log("id" + this.tableName);
    //查询所有表
    if(this.tableName == undefined){
      this.tableName = "";
    }
    this.tabledetail = new tabledetails("");
    this.tfinfo = new tablefieldinfo("","","","","");
    this.table = new tableName();

  }






  lazyload(event:any){
    console.log("定时拉取数据");
  }


  //查询枚举信息等
  info(event:any,name:String,tableName:String){
    //判断本次查询是否与上次相同，若是相同就不用再次查询
    if(tableName == this.CacheTableName&&name == this.CacheName){
      this.display1 = true;
      return;
    }
    this.affiliatedCorpService.queryinfo(tableName,name).subscribe((res:Response) =>{
      let body = JSON.parse(res['_body']);
      if (body['yhRspType'] == 'ERROR') {

      } else {
        let data = res.json().data;
        this.tfinfo = new tablefieldinfo("","","","","");//对之前的值进行清空
        if(data == null){
          this.tfinfo = new tablefieldinfo(tableName,name,"","","");
        }else{
          this.tfinfo = new tablefieldinfo(data.tableName,data.name,data.enumRemark,data.remark,data.business);
        }
      }

    }, (res: Response) => {
      this.showMsg("连接服务器异常" + '!', 'info');
    });
    this.display1 = true;
    //用于缓存，防止大量调用程序
    this.CacheTableName = tableName;
    this.CacheName = name;
  }

  //查询业务信息
  business(event:any,name:String,tableName:String){
    if(tableName == this.CacheTableName&&name == this.CacheName){
      this.display2 = true;
      return;
    }
    this.affiliatedCorpService.queryinfo(tableName,name).subscribe((res:Response) =>{
      let body = JSON.parse(res['_body']);
      if (body['yhRspType'] == 'ERROR') {

      } else {
        let data = res.json().data;
        this.tfinfo = new tablefieldinfo("","","","","");//对之前的值进行清空
        if(data == null){
          this.tfinfo = new tablefieldinfo(tableName,name,"","","");
        }else{
          this.tfinfo = new tablefieldinfo(data.tableName,data.name,data.enumRemark,data.remark,data.business);
        }
      }

    }, (res: Response) => {
      this.showMsg("连接服务器异常" + '!', 'info');
    });
    this.display2 = true;
    //用于缓存，防止大量调用程序
    this.CacheTableName = tableName;
    this.CacheName = name;
  }



  format(content: number){
    if(content == 0){
      return "";
    }else if(content == null){
      return "";
    }
    else{
      return "注";
    }
  }

  //状态
  format_state(content: number){
    if(content == 0){
      return "无效";
    }else if(content == null){
      return "无效";
    }
    else{
      return "有效";
    }
  }



  searchTable(event:any,chName:String,tableName:String){
    this.affiliatedCorpService.query(tableName).subscribe((res: Response) => {
      let body = JSON.parse(res['_body']);
      if (body['yhRspType'] == 'ERROR') {

      } else {
        let data = res.json().data;
        this.affs = null;
        this.affs = data;

      }

    }, (res: Response) => {
      this.showMsg("连接服务器异常" + '!', 'info');
    });

    //获取表信息
    this.affiliatedCorpService.queryTable(tableName).subscribe((res: Response)=>{
      let body = JSON.parse(res['_body']);
      this.tabledetail = null;
      if (body['yhRspType'] == 'ERROR') {

      } else {
        let data = res.json().data;
        if(data == null){
          this.tabledetail = new tabledetails(this.table.tableName);
        }else{
          this.tabledetail = data;
        }
        
        
      }

    }, (res: Response) => {
      this.showMsg("连接服务器异常" + '!', 'info');
    });
    this.maindisplay1 = true;
  }

}
