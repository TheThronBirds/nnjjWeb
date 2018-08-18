import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { MessageDialogRoutingModule } from './message-dialog-routing.module';
import { MessageDialogComponent } from './message-dialog.component';

@NgModule({
  imports: [
    CommonModule,
    MessageDialogRoutingModule
  ],
  declarations: [MessageDialogComponent]
})
export class MessageDialogModule { }
