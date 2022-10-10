package com.google.events;

/**
 * The event data when a message is published to a topic.
 */
@lombok.Data
public class MessagePublishedData {
    private Message message;
    private String subscription;
}
