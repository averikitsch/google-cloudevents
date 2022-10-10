package com.google.events;

import java.time.OffsetDateTime;

/**
 * Additional metadata about the user.
 */
@lombok.Data
public class Metadata {
    private OffsetDateTime createTime;
    private OffsetDateTime lastSignInTime;
}
