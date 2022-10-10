package io.quicktype;

import java.util.List;

/**
 * Special options for this build.
 *
 * Optional arguments to enable specific features of builds.
 */
@lombok.Data
public class Options {
    private Long diskSizeGb;
    private List<String> env;
    private LogStreamingOption logStreamingOption;
    private LoggingMode logging;
    private MachineType machineType;
    private VerifyOption requestedVerifyOption;
    private List<String> secretEnv;
    private List<SourceProvenanceHashElement> sourceProvenanceHash;
    private SubstitutionOption substitutionOption;
    private List<Volume> volumes;
    private String workerPool;
}
