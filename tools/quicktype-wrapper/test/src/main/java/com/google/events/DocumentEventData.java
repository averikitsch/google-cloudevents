package com.google.events;

/**
 * The data within all Firestore document events.
 */
@lombok.Data
public class DocumentEventData {
    private OldValue oldValue;
    private Mask updateMask;
    private DocumentEventDataValue value;
}
