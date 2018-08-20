import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MessageDialogComponent } from './message-dialog.component';

const routes: Routes = [
  {
    path: 'Message',
    component: MessageDialogComponent
<<<<<<< HEAD
    },
=======
  }
>>>>>>> branch 'master' of https://github.com/TheThronBirds/nnjjWeb.git
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class MessageDialogRoutingModule { }
