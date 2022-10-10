package io.quicktype;

/**
 * The configuration for forwarding telemetry events.
 */
@lombok.Data
public class EventNotificationConfig {
    private String pubsubTopicName;
    private String subfolderMatches;
}
