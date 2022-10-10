package io.quicktype;

/**
 * Information indicating this LogEntry is part of a sequence of multiple logs split from a
 * single LogEntry.
 *
 * Additional information used to correlate multiple LogEntries. Used when a single LogEntry
 * would exceed the Google Cloud Logging size limit and is split across multiple entries.
 */
@lombok.Data
public class Split {
    private Long index;
    private Long totalSplits;
    private String uid;
}
