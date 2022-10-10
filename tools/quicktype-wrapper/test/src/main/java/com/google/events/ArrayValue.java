package com.google.events;

import java.util.List;

/**
 * An array value. Cannot directly contain another array value, though can contain an map
 * which contains another array.
 *
 * An array value.
 */
@lombok.Data
public class ArrayValue {
    private List<ValueElement> values;
}
