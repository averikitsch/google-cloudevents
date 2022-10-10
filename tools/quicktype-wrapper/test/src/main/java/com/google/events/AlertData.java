package com.google.events;

import java.time.OffsetDateTime;
import java.util.Map;

/**
 * The data within all Firebase Alerts.
 */
@lombok.Data
public class AlertData {
    private OffsetDateTime createTime;
    private OffsetDateTime endTime;
    private Map<String, Object> payload;
}
