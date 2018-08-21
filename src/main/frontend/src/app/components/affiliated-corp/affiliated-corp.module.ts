import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AppSharedModule } from '@yh-frond-frameworks/biz-common';



import { AffiliatedCorpRoutingModule } from './affiliated-corp-routing.module';
import { AffiliatedCorpComponent } from './affiliated-corp.component';
import { AffiliatedCorpService } from './affiliated-corp.service';

@NgModule({
  imports: [
    CommonModule,
    AffiliatedCorpRoutingModule,
    AppSharedModule

  ],
  providers: [AffiliatedCorpService],

  declarations: [AffiliatedCorpComponent]
})
export class AffiliatedCorpModule{}
