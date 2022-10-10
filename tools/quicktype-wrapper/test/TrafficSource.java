package io.quicktype;

/**
 * Information about marketing campaign which acquired the user.
 *
 * Mesage containing marketing campaign information which acquired the user.
 */
@lombok.Data
public class TrafficSource {
    private String userAcquiredCampaign;
    private String userAcquiredMedium;
    private String userAcquiredSource;
}
