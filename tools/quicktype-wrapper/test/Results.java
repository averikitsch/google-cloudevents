package io.quicktype;

import java.util.List;

/**
 * Results of the build.
 *
 * Artifacts created by the build pipeline.
 */
@lombok.Data
public class Results {
    private String artifactManifest;
    private ArtifactTiming artifactTiming;
    private List<String> buildStepImages;
    private List<String> buildStepOutputs;
    private List<BuiltImage> images;
    private Long numArtifacts;
}
