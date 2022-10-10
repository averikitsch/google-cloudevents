package com.google.events;

/**
 * If provided, get the source from this location in Google Cloud Storage.
 *
 * Location of the source in an archive file in Google Cloud Storage.
 */
@lombok.Data
public class StorageSourceClass {
    private String bucket;
    private Long generation;
    private String object;
}
