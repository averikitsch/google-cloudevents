package com.google.events;

import java.util.List;

/**
 * Optional. The Registry event payload. Unset for deletion events.
 *
 * A container for a group of devices.
 */
@lombok.Data
public class RegistryEventDataPayload {
    private List<RegistryCredential> credentials;
    private List<EventNotificationConfig> eventNotificationConfigs;
    private HTTPConfig httpConfig;
    private String id;
    private LogLevelUnion logLevel;
    private MqttConfig mqttConfig;
    private String name;
    private StateNotificationConfig stateNotificationConfig;
}
