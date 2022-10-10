package com.google.events;

import java.util.List;

/**
 * A step in the build pipeline.
 */
@lombok.Data
public class BuildStep {
    private List<String> args;
    private String dir;
    private String entrypoint;
    private List<String> env;
    private String id;
    private String name;
    private PullTiming pullTiming;
    private List<String> secretEnv;
    private StatusUnion status;
    private String timeout;
    private StepTiming timing;
    private List<Volume> volumes;
    private List<String> waitFor;
}
