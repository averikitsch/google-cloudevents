package com.google.events;

import java.time.OffsetDateTime;
import java.util.Map;

/**
 * The data within all Cloud Audit Logs log entry events.
 */
@lombok.Data
public class LogEntryData {
    private String insertId;
    private Map<String, String> labels;
    private String logName;
    private Operation operation;
    private ProtoPayload protoPayload;
    private OffsetDateTime receiveTimestamp;
    private ResourceClass resource;
    private LogSeverity severity;
    private String spanId;
    private Split split;
    private OffsetDateTime timestamp;
    private String trace;
}
