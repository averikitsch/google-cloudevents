package com.google.events;

import java.util.Map;

/**
 * A map value.
 */
@lombok.Data
public class MapValue {
    private Map<String, MapValueField> fields;
}
