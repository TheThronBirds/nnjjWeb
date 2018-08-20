import { Component, OnInit } from '@angular/core';
import {DialogModule} from 'primeng/dialog';

@Component({
  selector: 'app-message-dialog',
  templateUrl: './message-dialog.component.html',
  styleUrls: ['./message-dialog.component.css']
})
export class MessageDialogComponent implements OnInit {

  display: boolean = true;
  constructor() { }

  ngOnInit() {
  }

}
