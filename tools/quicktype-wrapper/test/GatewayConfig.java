package io.quicktype;

import java.time.OffsetDateTime;

/**
 * Gateway-related configuration and state.
 */
@lombok.Data
public class GatewayConfig {
    private GatewayAuthMethod gatewayAuthMethod;
    private GatewayType gatewayType;
    private String lastAccessedGatewayId;
    private OffsetDateTime lastAccessedGatewayTime;
}
