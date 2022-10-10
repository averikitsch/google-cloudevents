package com.google.events;

/**
 * Information regarding the bundle in which these events were uploaded.
 *
 * Message containing information regarding the bundle in which these events were uploaded.
 */
@lombok.Data
public class BundleInfo {
    private Long bundleSequenceId;
    private Long serverTimestampOffsetMicros;
}
