package io.quicktype;

/**
 * The location of the source files to build.
 */
@lombok.Data
public class Source {
    private RepoSourceClass repoSource;
    private StorageSourceClass storageSource;
}
