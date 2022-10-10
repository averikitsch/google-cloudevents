package io.quicktype;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * `Value` represents a dynamically typed value which can be either null, a number, a
 * string, a boolean, a recursive struct value, or a list of values. A producer of value is
 * expected to set one of that variants, absence of any variant indicates an error. The JSON
 * representation for `Value` is JSON value.
 */
public class Value {
    public List<Object> anythingArrayValue;
    public Boolean boolValue;
    public Double doubleValue;
    public Map<String, Object> anythingMapValue;
    public String stringValue;
}
