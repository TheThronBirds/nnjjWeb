import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AppSharedModule } from '@yh-frond-frameworks/biz-common';



import { PageNotFoundComponent } from './not-found.component';
import { MessageDialogModule } from './components/message-dialog/message-dialog.module';
import { MenubarComponent } from './components/menubar/menubar.component';
import { AffiliatedCorpComponent } from './components/affiliated-corp/affiliated-corp.component';
import { AffiliatedCorpService } from './components/affiliated-corp/affiliated-corp.service';
import { MenubarService } from './components/menubar/menubar.service';
import { CommonModule } from '@angular/common';
<<<<<<< HEAD
//import { MenuComponent } from './components/menu/menu.component';



@NgModule({
  declarations: [
    AppComponent,
    PageNotFoundComponent,
    MenubarComponent,
    AffiliatedCorpComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    AppSharedModule,
    CommonModule
  ],
  providers: [AffiliatedCorpService,MenubarService],
=======
import { MessageDialogComponent } from './components/message-dialog/message-dialog.component';
import { AffiliatedCorpModule } from './components/affiliated-corp/affiliated-corp.module';
import { MessageDialogService } from './components/message-dialog/message-dialog.service';
//import { MenuComponent } from './components/menu/menu.component';



@NgModule({
  declarations: [
    AppComponent,
    PageNotFoundComponent,
    MenubarComponent,
    AffiliatedCorpComponent,
    MessageDialogComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    AppSharedModule,
    CommonModule,
  ],
  providers: [AffiliatedCorpService,MenubarService,MessageDialogService],
>>>>>>> branch 'master' of https://github.com/TheThronBirds/nnjjWeb.git
  bootstrap: [AppComponent]
})
export class AppModule { }
