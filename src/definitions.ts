export interface HeartbeatPluginPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
