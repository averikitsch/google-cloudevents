package com.google.events;

/**
 * Device information.
 *
 * Message containing device informations.
 */
@lombok.Data
public class DeviceInfo {
    private String deviceCategory;
    private String deviceId;
    private String deviceModel;
    private Long deviceTimeZoneOffsetSeconds;
    private Boolean limitedAdTracking;
    private String mobileBrandName;
    private String mobileMarketingName;
    private String mobileModelName;
    private String platformVersion;
    private String resettableDeviceId;
    private String userDefaultLanguage;
}
