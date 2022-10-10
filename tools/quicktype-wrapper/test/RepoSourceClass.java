package io.quicktype;

import java.util.Map;

/**
 * If provided, get the source from this location in a Cloud Source Repository.
 *
 * Location of the source in a Google Cloud Source Repository.
 */
@lombok.Data
public class RepoSourceClass {
    private String branchName;
    private String commitSha;
    private String dir;
    private Boolean invertRegex;
    private String projectId;
    private String repoName;
    private Map<String, String> substitutions;
    private String tagName;
}
