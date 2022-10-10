package io.quicktype;

import java.time.OffsetDateTime;

/**
 * Stores timing information for pushing all artifact objects.
 *
 * Start and end times for a build execution phase.
 */
@lombok.Data
public class TimeSpan {
    private OffsetDateTime endTime;
    private OffsetDateTime startTime;
}
