package com.google.events;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * Build event data for Google Cloud Platform API operations.
 */
@lombok.Data
public class BuildEventData {
    private Artifacts artifacts;
    private String buildTriggerId;
    private OffsetDateTime createTime;
    private OffsetDateTime finishTime;
    private String id;
    private List<String> images;
    private String logUrl;
    private String logsBucket;
    private Options options;
    private String projectId;
    private String queueTtl;
    private Results results;
    private List<Secret> secrets;
    private Source source;
    private SourceProvenance sourceProvenance;
    private OffsetDateTime startTime;
    private StatusUnion status;
    private String statusDetail;
    private List<BuildStep> steps;
    private Map<String, String> substitutions;
    private List<String> tags;
    private String timeout;
    private Map<String, TimeSpan> timing;
}
