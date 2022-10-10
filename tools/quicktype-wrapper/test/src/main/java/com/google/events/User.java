package com.google.events;

/**
 * Aggregation of all metadata fields about the account that performed the  update.
 *
 * All the fields associated with the person/service account that wrote a Remote Config
 * template.
 */
@lombok.Data
public class User {
    private String email;
    private String imageUrl;
    private String name;
}
