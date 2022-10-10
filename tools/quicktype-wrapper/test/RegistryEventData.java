package io.quicktype;

/**
 * The data within all Cloud IoT Registry events.
 */
@lombok.Data
public class RegistryEventData {
    private RegistryEventDataPayload payload;
}
