package io.quicktype;

import java.time.OffsetDateTime;

/**
 * A message that can hold any of the supported value types.
 */
@lombok.Data
public class OldValueField {
    private ArrayValue arrayValue;
    private Boolean booleanValue;
    private String bytesValue;
    private Double doubleValue;
    private GeoPointValue geoPointValue;
    private Long integerValue;
    private MapValue mapValue;
    private NullValue nullValue;
    private String referenceValue;
    private String stringValue;
    private OffsetDateTime timestampValue;
}
