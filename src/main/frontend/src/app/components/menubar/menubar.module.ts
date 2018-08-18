import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { MenubarRoutingModule } from './menubar-routing.module';
import { AffiliatedCorpComponent } from '../affiliated-corp/affiliated-corp.component';
import { AffiliatedCorpModule } from '../affiliated-corp/affiliated-corp.module';
import { BrowserModule } from '@angular/platform-browser';

@NgModule({
  imports: [
    CommonModule,
    MenubarRoutingModule,
    AffiliatedCorpModule,
    BrowserModule
  ],
  declarations: [AffiliatedCorpComponent]
})
export class MenubarModule { }
