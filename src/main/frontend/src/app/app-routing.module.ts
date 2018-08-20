import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PageNotFoundComponent } from './not-found.component';
<<<<<<< HEAD
const routes: Routes = [

  {
    path: "",
    redirectTo: "",
    pathMatch: "full"
  }
=======
import { MessageDialogComponent } from './components/message-dialog/message-dialog.component';
import { AffiliatedCorpComponent } from './components/affiliated-corp/affiliated-corp.component';
const routes: Routes = [

  { path: '',redirectTo: "Message",pathMatch: "full"},
  { path: 'Message',component: MessageDialogComponent},
  { path: 'tableSearch/:tableName',component: AffiliatedCorpComponent}
>>>>>>> branch 'master' of https://github.com/TheThronBirds/nnjjWeb.git
];

@NgModule({
  imports: [RouterModule.forRoot(routes, { useHash: true })],
  exports: [RouterModule]
})
export class AppRoutingModule { }
