package io.quicktype;

import java.time.OffsetDateTime;

/**
 * The data within all Firebase test matrix events.
 */
@lombok.Data
public class TestMatrixEventData {
    private ClientInfo clientInfo;
    private OffsetDateTime createTime;
    private String invalidMatrixDetails;
    private OutcomeSummary outcomeSummary;
    private ResultStorage resultStorage;
    private TestState state;
    private String testMatrixId;
}
