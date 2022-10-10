package io.quicktype;

import java.util.List;
import java.util.Map;

/**
 * The data within all Firebase Real Time Database reference events.
 */
@lombok.Data
public class ReferenceEventData {
    private Value data;
    private Value delta;
}
