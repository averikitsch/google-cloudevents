package com.google.events;

import java.util.List;

/**
 * Artifacts produced by the build that should be uploaded upon successful completion of all
 * build steps.
 *
 * Artifacts produced by a build that should be uploaded upon successful completion of all
 * build steps.
 */
@lombok.Data
public class Artifacts {
    private List<String> images;
    private Objects objects;
}
