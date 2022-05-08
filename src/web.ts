import { WebPlugin } from '@capacitor/core';

import type { HeartbeatPluginPlugin } from './definitions';

export class HeartbeatPluginWeb extends WebPlugin implements HeartbeatPluginPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }

  async echo2(options2: { asd: string }): Promise<{ asd: string }> {
    console.log('ECHO', options2);
    return options2;
  }

  async proba(options3: { test: string }): Promise<{ test: string }> {
    console.log('Proba', options3);
    return options3;
  }





}

