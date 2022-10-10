package io.quicktype;

import java.time.OffsetDateTime;
import java.util.Map;

/**
 * The message that was published.
 *
 * A message published to a topic.
 */
@lombok.Data
public class Message {
    private Map<String, String> attributes;
    private String data;
    private String messageId;
    private String orderingKey;
    private OffsetDateTime publishTime;
}
