package io.quicktype;

import java.time.OffsetDateTime;

/**
 * The most recent device configuration, which is eventually sent from Cloud IoT Core to the
 * device. If not present on creation, the configuration will be initialized with an empty
 * payload and version value of `1`. To update this field after creation, use the
 * `DeviceManager.ModifyCloudToDeviceConfig` method.
 *
 * The device configuration. Eventually delivered to devices.
 */
@lombok.Data
public class Config {
    private String binaryData;
    private OffsetDateTime cloudUpdateTime;
    private OffsetDateTime deviceAckTime;
    private Long version;
}
