package io.quicktype;

/**
 * Volume describes a Docker container volume which is mounted into build steps in order to
 * persist files across build step execution.
 */
@lombok.Data
public class Volume {
    private String name;
    private String path;
}
