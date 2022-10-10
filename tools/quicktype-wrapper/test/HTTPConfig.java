package io.quicktype;

/**
 * The DeviceService (HTTP) configuration for this device registry.
 *
 * The configuration of the HTTP bridge for a device registry.
 */
@lombok.Data
public class HTTPConfig {
    private HTTPState httpEnabledState;
}
