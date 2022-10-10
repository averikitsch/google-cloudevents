package com.google.events;

/**
 * Predefined (eg: LTV) or custom properties (eg: birthday) stored on client side and
 * associated with subsequent HitBundles.
 */
@lombok.Data
public class UserPropertyValue {
    private Long index;
    private Long setTimestampUsec;
    private UserPropertyValueClass value;
}
