export interface HeartbeatPluginPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
  echo2(options2: { asd: string }): Promise<{ asd: string }>;
  proba(options3: { asdd: string }): Promise<{ asdd: string }>;
}
