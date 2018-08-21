import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PageNotFoundComponent } from './not-found.component';
import { MessageDialogComponent } from './components/message-dialog/message-dialog.component';
import { AffiliatedCorpComponent } from './components/affiliated-corp/affiliated-corp.component';
const routes: Routes = [

  { path: '',redirectTo: "Message",pathMatch: "full"},
  { path: 'Message',component: MessageDialogComponent},
  { path: 'tableSearch/:tableName',component: AffiliatedCorpComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes, { useHash: true })],
  exports: [RouterModule]
})
export class AppRoutingModule { }
