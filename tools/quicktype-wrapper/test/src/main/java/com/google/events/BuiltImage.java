package com.google.events;

/**
 * An image built by the pipeline.
 */
@lombok.Data
public class BuiltImage {
    private String digest;
    private String name;
    private PushTiming pushTiming;
}
