package com.google.events;

/**
 * The configuration for notification of new states received from the device. State updates
 * are guaranteed to be stored in the state history, but notifications to Cloud Pub/Sub are
 * not guaranteed. For example, if permissions are misconfigured or the specified topic
 * doesn't exist, no notification will be published but the state will still be stored in
 * Cloud IoT Core.
 *
 * The configuration for notification of new states received from the device.
 */
@lombok.Data
public class StateNotificationConfig {
    private String pubsubTopicName;
}
