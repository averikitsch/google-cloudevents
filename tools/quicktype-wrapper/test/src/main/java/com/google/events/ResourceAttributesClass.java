package com.google.events;

import java.util.Map;

/**
 * Resource attributes used in IAM condition evaluation. This field contains resource
 * attributes like resource type and resource name. To get the whole view of the attributes
 * used in IAM condition evaluation, the user must also look into
 * `AuditLogData.request_metadata.request_attributes`.
 *
 * This message defines core attributes for a resource. A resource is an addressable (named)
 * entity provided by the destination service. For example, a file stored on a network
 * storage service.
 */
@lombok.Data
public class ResourceAttributesClass {
    private Map<String, String> labels;
    private String name;
    private String service;
    private String type;
}
