package io.quicktype;

import java.time.OffsetDateTime;
import java.util.Map;

/**
 * A Document object containing a pre-operation document snapshot. This is only populated
 * for update and delete events.
 *
 * A Firestore document.
 */
@lombok.Data
public class OldValue {
    private OffsetDateTime createTime;
    private Map<String, OldValueField> fields;
    private String name;
    private OffsetDateTime updateTime;
}
