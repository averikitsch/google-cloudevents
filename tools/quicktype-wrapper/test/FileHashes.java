package io.quicktype;

import java.util.List;

/**
 * Container message for hashes of byte content of files, used in SourceProvenance messages
 * to verify integrity of source input to the build.
 */
@lombok.Data
public class FileHashes {
    private List<Hash> fileHash;
}
