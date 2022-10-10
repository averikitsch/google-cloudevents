package com.google.events;

import java.util.List;
import java.util.Map;

/**
 * The log entry payload, which is always an AuditLog for Cloud Audit Log events.
 *
 * Common audit log format for Google Cloud Platform API operations. Copied from
 * https://github.com/googleapis/googleapis/blob/master/google/cloud/audit/audit_log.proto,
 * but changing service_data from Any to Struct.
 */
@lombok.Data
public class ProtoPayload {
    private AuthenticationInfo authenticationInfo;
    private List<AuthorizationInfo> authorizationInfo;
    private Map<String, Object> metadata;
    private String methodName;
    private Long numResponseItems;
    private Map<String, Object> request;
    private RequestMetadata requestMetadata;
    private ResourceLocation resourceLocation;
    private String resourceName;
    private Map<String, Object> resourceOriginalState;
    private Map<String, Object> response;
    private Map<String, Object> serviceData;
    private String serviceName;
    private StatusClass status;
}
