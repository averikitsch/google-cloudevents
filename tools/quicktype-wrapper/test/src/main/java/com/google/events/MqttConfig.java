package com.google.events;

/**
 * The MQTT configuration for this device registry.
 *
 * The configuration of MQTT for a device registry.
 */
@lombok.Data
public class MqttConfig {
    private MqttState mqttEnabledState;
}
