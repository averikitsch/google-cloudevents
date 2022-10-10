package com.google.events;

import java.util.Map;

/**
 * The monitored resource that produced this log entry. Example: a log entry that reports a
 * database error would be associated with the monitored resource designating the particular
 * database that reported the error.
 *
 * Note: this is a much-reduced version of the proto at
 * https://github.com/googleapis/googleapis/blob/master/google/api/monitored_resource.proto
 * to avoid other dependencies leaking into events.  An object representing a resource that
 * can be used for monitoring, logging, billing, or other purposes.
 */
@lombok.Data
public class ResourceClass {
    private Map<String, String> labels;
    private String type;
}
