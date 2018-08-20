import { Component, OnInit,Input } from '@angular/core';

import { Hero } from '../../hero';
import { Response } from '@angular/http';
import { ButtonService } from '@yh-frond-frameworks/biz-common/button/button.service';
import { ActivatedRoute } from '@angular/router';
import { MenubarService } from './menubar.service';
import { BaseModel, BaseSearchModel, Base } from '@yh-frond-frameworks/biz-common';
import { tableName } from '../affiliated-corp/domain/tableName';
import { tableModule } from '../affiliated-corp/domain/tableModule';
import { tablesearch } from '../affiliated-corp/domain/tablesearch';

@Component({
  selector: 'app-menubar',
  templateUrl: './menubar.component.html',
  styleUrls: ['./menubar.component.css']
})
export class MenubarComponent extends Base<BaseModel, BaseSearchModel> implements OnInit {

  //导航栏控制参数
  rootmenu1:number;
  i:number;
  selectedCities:String;
  searchName:String;
  model = new tablesearch(0," ",1);
  tables: tableModule[];
  
    selectedTable: tableName;
  
    constructor(public buttonService?: ButtonService,public menubarService?: MenubarService,
      public route?: ActivatedRoute) { super(); }
  
    ngOnInit() {

      //初始化为导航
      this.rootmenu1 = 1;
      this.menubarService.queryTableName().subscribe((res: Response) => {
        let body = JSON.parse(res['_body']);
        if (body['yhRspType'] == 'ERROR') {
  
        } else {
          let data = res.json().data;
          console.log(data[0].chName+"444");

          this.tables = data;
          console.log(this.tables);
  
        }
  
      }, (res: Response) => {
        this.showMsg("连接服务器异常" + '!', 'info');
      });
      this.selectedTable = new tableName("无");
      console.log(this.selectedTable + "selectedTable");
    }
  
    onSelect(table: tableName): void {
      console.log("点击");
      this.selectedTable = table;
    }
    

    //点击模块出发
    onmenu(i: number):void{
      console.log("999");
      if(this.i == i){
        //第二次点击，设置为0，即全部都是关闭的
        this.i = 0;
      }else{
        this.i = i;
      }
      
        
    }


    //导航栏与搜索栏点击事件
    rootmenu(i:number):void{
      console.log("主目录切换");
      this.rootmenu1 = i;
    }



    handleClick(event:any){
      this.model = new tablesearch(1,this.model.searchName,this.model.selectType);
    }

}
