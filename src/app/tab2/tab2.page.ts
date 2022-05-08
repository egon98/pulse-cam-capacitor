import { Component } from '@angular/core';
import HeartbeatPlugin from "../tab1/tab1.page";

@Component({
  selector: 'app-tab2',
  templateUrl: 'tab2.page.html',
  styleUrls: ['tab2.page.scss']
})
export class Tab2Page {

  constructor() {}
  
  kiir() {
    HeartbeatPlugin.echo({value: 'asd'})
  }

  beir() {
    HeartbeatPlugin.proba({test: 'valami'})
  }

}
