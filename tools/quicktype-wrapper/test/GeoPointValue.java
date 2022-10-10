package io.quicktype;

/**
 * A geo point value representing a point on the surface of Earth.
 *
 * An object representing a latitude/longitude pair. This is expressed as a pair of doubles
 * representing degrees latitude and degrees longitude. Unless specified otherwise, this
 * must conform to the <a
 * href="http://www.unoosa.org/pdf/icg/2012/template/WGS_84.pdf">WGS84 standard</a>. Values
 * must be within normalized ranges.
 */
@lombok.Data
public class GeoPointValue {
    private Double latitude;
    private Double longitude;
}
