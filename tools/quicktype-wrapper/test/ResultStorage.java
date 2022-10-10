package io.quicktype;

/**
 * Locations where test results are stored.
 */
@lombok.Data
public class ResultStorage {
    private String gcsPath;
    private String resultsUri;
    private String toolResultsExecution;
    private String toolResultsHistory;
}
