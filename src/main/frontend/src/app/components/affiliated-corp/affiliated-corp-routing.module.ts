import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AffiliatedCorpComponent } from './affiliated-corp.component';

const routes: Routes = [
  {
    path: 'tableSearch/:tableName',
    component: AffiliatedCorpComponent
    },
  {
  path: 'tableSearch',
  component: AffiliatedCorpComponent
  },
  ];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AffiliatedCorpRoutingModule { }
