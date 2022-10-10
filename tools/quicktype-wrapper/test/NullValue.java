package io.quicktype;

import java.io.IOException;

/**
 * `NullValue` is a singleton enumeration to represent the null value for the `Value` type
 * union.  The JSON representation for `NullValue` is JSON `null`.
 */
public class NullValue {
    public NullValueEnum enumValue;
    public Long integerValue;
}
