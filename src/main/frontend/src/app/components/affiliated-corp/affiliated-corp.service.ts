import { Injectable } from '@angular/core';
import { Http,Response } from '@angular/http';
import { BaseService } from '@yh-frond-frameworks/biz-common';
import { tableinfo } from './domain/tableinfo.module';
import { Observable } from 'rxjs';


@Injectable()
export class AffiliatedCorpService extends BaseService {

  requestUrl: string = "http://localhost:10101/risk/tableSearch";
  requestinfoUrl: String = "http://localhost:10101/risk/TableFieldInfo";
  reuqestTableUrl: String = "http://localhost:10101/risk/tableInfo";
  requestSearchURl: String = "http://localhost:10101/risk/searchTable";

  constructor(protected http: Http) { super(); }

  query(tableName:String): Observable<Response> {
    let url = this.requestUrl + "?tableName=" + tableName;
    console.log("查询：" + url);
    return this.http.get(url, this.createRequestOption());
  }


  //查询表字段的详细信息
  queryinfo(tableName:String,name:String){
    let url = this.requestinfoUrl + "?tableName=" + tableName + "&name=" + name;
    console.log("查询字段" + name + url);
    return this.http.get(url,this.createRequestOption());
  }

  queryTable(tableName:String){
    let url = this.reuqestTableUrl + "?tableName=" + tableName;
    console.log("查询表" + tableName + url);
    return this.http.get(url,this.createRequestOption());
  }

  //查询模块查询表
  searchtable(tableName:String,searchType:number){
    if(searchType == 1){
      let url = this.requestSearchURl + "?tableName=" + tableName;
      console.log("查询表" + url);
      return this.http.get(url,this.createRequestOption());
    }
  }
}
