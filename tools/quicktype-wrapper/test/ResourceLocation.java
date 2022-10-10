package io.quicktype;

import java.util.List;

/**
 * The resource location information.
 *
 * Location information about a resource.
 */
@lombok.Data
public class ResourceLocation {
    private List<String> currentLocations;
    private List<String> originalLocations;
}
