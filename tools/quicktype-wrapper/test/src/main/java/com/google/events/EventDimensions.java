package com.google.events;

import java.util.Map;

/**
 * Message containing information pertaining to the event.
 */
@lombok.Data
public class EventDimensions {
    private String date;
    private String name;
    private Map<String, AnalyticsValue> params;
    private Long previousTimestampMicros;
    private Long timestampMicros;
    private Double valueInUsd;
}
