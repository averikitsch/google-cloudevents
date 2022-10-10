package com.google.events;

import java.time.OffsetDateTime;

/**
 * Stores timing information for executing this build step.
 *
 * Stores timing information for pushing all artifact objects.
 *
 * Start and end times for a build execution phase.
 */
@lombok.Data
public class StepTiming {
    private OffsetDateTime endTime;
    private OffsetDateTime startTime;
}
