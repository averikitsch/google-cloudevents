package com.google.events;

/**
 * A copy of the build's `source.storage_source`, if exists, with any generations resolved.
 *
 * If provided, get the source from this location in Google Cloud Storage.
 *
 * Location of the source in an archive file in Google Cloud Storage.
 */
@lombok.Data
public class ResolvedStorageSourceClass {
    private String bucket;
    private Long generation;
    private String object;
}
