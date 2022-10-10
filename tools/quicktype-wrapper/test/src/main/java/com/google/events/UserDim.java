package com.google.events;

import java.util.Map;

/**
 * User related dimensions.
 *
 * Message containing information about the user associated with the event.
 */
@lombok.Data
public class UserDim {
    private AppInfo appInfo;
    private BundleInfo bundleInfo;
    private DeviceInfo deviceInfo;
    private Long firstOpenTimestampMicros;
    private GeoInfo geoInfo;
    private LtvInfo ltvInfo;
    private TrafficSource trafficSource;
    private String userId;
    private Map<String, UserPropertyValue> userProperties;
}
