package io.quicktype;

import java.io.IOException;

public enum OutcomeSummaryEnum {
    FAILURE, INCONCLUSIVE, OUTCOME_SUMMARY_UNSPECIFIED, SKIPPED, SUCCESS;

    public String toValue() {
        switch (this) {
            case FAILURE: return "FAILURE";
            case INCONCLUSIVE: return "INCONCLUSIVE";
            case OUTCOME_SUMMARY_UNSPECIFIED: return "OUTCOME_SUMMARY_UNSPECIFIED";
            case SKIPPED: return "SKIPPED";
            case SUCCESS: return "SUCCESS";
        }
        return null;
    }

    public static OutcomeSummaryEnum forValue(String value) throws IOException {
        if (value.equals("FAILURE")) return FAILURE;
        if (value.equals("INCONCLUSIVE")) return INCONCLUSIVE;
        if (value.equals("OUTCOME_SUMMARY_UNSPECIFIED")) return OUTCOME_SUMMARY_UNSPECIFIED;
        if (value.equals("SKIPPED")) return SKIPPED;
        if (value.equals("SUCCESS")) return SUCCESS;
        throw new IOException("Cannot deserialize OutcomeSummaryEnum");
    }
}
