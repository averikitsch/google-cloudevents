package com.google.events;

import java.time.OffsetDateTime;

/**
 * [Output only] The state most recently received from the device. If no state has been
 * reported, this field is not present.
 *
 * The device state, as reported by the device.
 */
@lombok.Data
public class State {
    private String binaryData;
    private OffsetDateTime updateTime;
}
