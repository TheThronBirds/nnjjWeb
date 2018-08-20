import { Injectable } from '@angular/core';
import { BaseService } from '@yh-frond-frameworks/biz-common';
import { Http,Response } from '@angular/http';
import { Observable } from 'rxjs';

@Injectable()
export class MenubarService extends BaseService{
  requestUrl: string = "http://172.16.33.157:10101/risk/tableName";

  constructor(protected http: Http) { super(); }

  queryTableName(): Observable<Response> {
    let url = this.requestUrl;
    console.log("查询：" + url);
    return this.http.get(url,this.createRequestOption());
  }

}
