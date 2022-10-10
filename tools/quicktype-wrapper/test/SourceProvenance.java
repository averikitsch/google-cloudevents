package io.quicktype;

import java.util.Map;

/**
 * A permanent fixed identifier for source.
 *
 * Provenance of the source. Ways to find the original source, or verify that some source
 * was used for this build.
 */
@lombok.Data
public class SourceProvenance {
    private Map<String, FileHashes> fileHashes;
    private ResolvedRepoSourceClass resolvedRepoSource;
    private ResolvedStorageSourceClass resolvedStorageSource;
}
