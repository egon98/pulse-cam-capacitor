import { WebPlugin } from '@capacitor/core';

import type { HeartbeatPluginPlugin } from './definitions';

export class HeartbeatPluginWeb extends WebPlugin implements HeartbeatPluginPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
