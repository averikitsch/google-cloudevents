package io.quicktype;

import java.time.OffsetDateTime;
import java.util.Map;

/**
 * A Document object containing a post-operation document snapshot. This is not populated
 * for delete events.
 *
 * A Document object containing a pre-operation document snapshot. This is only populated
 * for update and delete events.
 *
 * A Firestore document.
 */
@lombok.Data
public class DocumentEventDataValue {
    private OffsetDateTime createTime;
    private Map<String, OldValueField> fields;
    private String name;
    private OffsetDateTime updateTime;
}
