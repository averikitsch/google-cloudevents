package io.quicktype;

import java.util.Map;

/**
 * A map value.
 */
@lombok.Data
public class MapValue {
    private Map<String, MapValueField> fields;
}
