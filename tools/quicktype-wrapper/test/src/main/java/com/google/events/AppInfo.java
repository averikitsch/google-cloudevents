package com.google.events;

/**
 * App information.
 *
 * Message which contains App Information.
 */
@lombok.Data
public class AppInfo {
    private String appId;
    private String appInstanceId;
    private String appPlatform;
    private String appStore;
    private String appVersion;
}
