package com.google.events;

import java.io.IOException;

/**
 * The severity of the event described in a log entry, expressed as one of the standard
 * severity levels listed below.  For your reference, the levels are assigned the listed
 * numeric values. The effect of using numeric values other than those listed is undefined.
 * Copied from
 * https://github.com/googleapis/googleapis/blob/master/google/logging/type/log_severity.proto
 */
public class LogSeverity {
    public LogSeverityEnum enumValue;
    public Long integerValue;
}
