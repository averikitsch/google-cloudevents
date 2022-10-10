package com.google.events;

import java.time.OffsetDateTime;

/**
 * Time to push all non-container artifacts.
 *
 * Stores timing information for pushing all artifact objects.
 *
 * Start and end times for a build execution phase.
 */
@lombok.Data
public class ArtifactTiming {
    private OffsetDateTime endTime;
    private OffsetDateTime startTime;
}
