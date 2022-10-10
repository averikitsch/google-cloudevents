package io.quicktype;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * Optional. The Device event payload. Unset for deletion events.
 *
 * The device resource.
 */
@lombok.Data
public class DeviceEventDataPayload {
    private Boolean blocked;
    private Config config;
    private List<DeviceCredential> credentials;
    private GatewayConfig gatewayConfig;
    private String id;
    private OffsetDateTime lastConfigAckTime;
    private OffsetDateTime lastConfigSendTime;
    private LastErrorStatusClass lastErrorStatus;
    private OffsetDateTime lastErrorTime;
    private OffsetDateTime lastEventTime;
    private OffsetDateTime lastHeartbeatTime;
    private OffsetDateTime lastStateTime;
    private LogLevelUnion logLevel;
    private Map<String, String> metadata;
    private String name;
    private Long numId;
    private State state;
}
