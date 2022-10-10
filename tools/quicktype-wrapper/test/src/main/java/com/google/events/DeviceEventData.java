package com.google.events;

/**
 * The data within all Cloud IoT Device events.
 */
@lombok.Data
public class DeviceEventData {
    private DeviceEventDataPayload payload;
}
