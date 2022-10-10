package com.google.events;

import java.time.OffsetDateTime;

/**
 * Stores timing information for pushing the specified image.
 *
 * Stores timing information for pushing all artifact objects.
 *
 * Start and end times for a build execution phase.
 */
@lombok.Data
public class PushTiming {
    private OffsetDateTime endTime;
    private OffsetDateTime startTime;
}
