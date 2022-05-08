import {Component, Injectable} from '@angular/core';
import 'heartbeat-plugin';
import {HeartbeatPluginWeb} from "heartbeat-plugin/src/web";
import {registerPlugin} from "@capacitor/core";
import {Plugins} from "@capacitor/core";
const {HeartbeatPluginPlugin} = Plugins;
//import {HeartbeatPlugin} from "heartbeat-plugin";

//erre dob errort
//import {HeartbeatPlugin} from "../../../android/app/src/main/java/io/ionic/starter"


@Component({
  selector: 'app-tab1',
  templateUrl: 'tab1.page.html',
  styleUrls: ['tab1.page.scss']
})

export class Tab1Page{
asd: any;
  constructor() {
  }

  kiir() {
   // HeartbeatPlugin.proba('asd')
    //this.asd = HeartbeatPlugin.proba('asd').value;
    HeartbeatPluginPlugin.proba({asdd: 'valami'});
   // HeartbeatPlugin.echo({value: 'asd'})
  }



}
