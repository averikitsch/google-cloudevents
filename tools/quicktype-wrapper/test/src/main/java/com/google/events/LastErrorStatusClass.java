package com.google.events;

import java.util.List;

/**
 * [Output only] The error message of the most recent error, such as a failure to publish to
 * Cloud Pub/Sub. 'last_error_time' is the timestamp of this field. If no errors have
 * occurred, this field has an empty message and the status code 0 == OK. Otherwise, this
 * field is expected to have a status code other than OK.
 *
 * The `Status` type defines a logical error model that is suitable for different
 * programming environments, including REST APIs and RPC APIs. It is used by
 * [gRPC](https://github.com/grpc). Each `Status` message contains three pieces of data:
 * error code, error message, and error details. You can find out more about this error
 * model and how to work with it in the [API Design
 * Guide](https://cloud.google.com/apis/design/errors).
 */
@lombok.Data
public class LastErrorStatusClass {
    private Long code;
    private List<LastErrorStatusDetail> details;
    private String message;
}
