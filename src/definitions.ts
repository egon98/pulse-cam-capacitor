export interface HeartbeatPluginPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
  echo2(options2: { asd: string }): Promise<{ asd: string }>;
  proba(options3: { test: string }): Promise<{ test: string }>;
}
