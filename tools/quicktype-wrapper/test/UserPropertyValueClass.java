package io.quicktype;

/**
 * Last set value of user property.
 *
 * Value for Event Params and UserProperty can be of type string or int or float or double.
 */
@lombok.Data
public class UserPropertyValueClass {
    private Double doubleValue;
    private Double floatValue;
    private Long intValue;
    private String stringValue;
}
