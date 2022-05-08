import { registerPlugin } from '@capacitor/core';

import type { HeartbeatPluginPlugin } from './definitions';


const HeartbeatPlugin = registerPlugin<HeartbeatPluginPlugin>('HeartbeatPlugin', {
  web: () => import('./web').then(m => new m.HeartbeatPluginWeb()),
});



export * from './definitions';
export { HeartbeatPlugin };
