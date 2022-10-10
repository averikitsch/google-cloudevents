package io.quicktype;

import java.util.List;

/**
 * A DocumentMask object that lists changed fields. This is only populated for update
 * events.
 *
 * A set of field paths on a document.
 */
@lombok.Data
public class Mask {
    private List<String> fieldPaths;
}
