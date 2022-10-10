package io.quicktype;

import java.time.OffsetDateTime;
import java.util.Map;

/**
 * Request attributes used in IAM condition evaluation. This field contains request
 * attributes like request time and access levels associated with the request. To get the
 * whole view of the attributes used in IAM condition evaluation, the user must also look
 * into `AuditLog.authentication_info.resource_attributes`.
 *
 * This message defines attributes for an HTTP request. If the actual request is not an HTTP
 * request, the runtime system should try to map the actual request to an equivalent HTTP
 * request.
 */
@lombok.Data
public class Request {
    private Auth auth;
    private Map<String, String> headers;
    private String host;
    private String id;
    private String method;
    private String path;
    private String protocol;
    private String query;
    private String reason;
    private String scheme;
    private Long size;
    private OffsetDateTime time;
}
