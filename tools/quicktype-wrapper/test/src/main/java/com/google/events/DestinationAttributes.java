package com.google.events;

import java.util.Map;

/**
 * The destination of a network activity, such as accepting a TCP connection. In a multi hop
 * network activity, the destination represents the receiver of the last hop. Only two
 * fields are used in this message, Peer.port and Peer.ip. These fields are optionally
 * populated by those services utilizing the IAM condition feature.
 *
 * This message defines attributes for a node that handles a network request. The node can
 * be either a service or an application that sends, forwards, or receives the request.
 * Service peers should fill in `principal` and `labels` as appropriate.
 */
@lombok.Data
public class DestinationAttributes {
    private String ip;
    private Map<String, String> labels;
    private Long port;
    private String principal;
    private String regionCode;
}
