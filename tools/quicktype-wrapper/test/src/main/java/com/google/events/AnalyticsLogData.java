package com.google.events;

import java.util.List;

/**
 * The data within Firebase Analytics log events.
 */
@lombok.Data
public class AnalyticsLogData {
    private List<EventDimensions> eventDim;
    private UserDim userDim;
}
