package com.google.events;

import java.util.List;

/**
 * A list of objects to be uploaded to Cloud Storage upon successful completion of all build
 * steps. Files in the workspace matching specified paths globs will be uploaded to the
 * specified Cloud Storage location using the builder service account's credentials. The
 * location and generation of the uploaded objects will be stored in the Build resource's
 * results field. If any objects fail to be pushed, the build is marked FAILURE.
 *
 * Files in the workspace to upload to Cloud Storage upon successful completion of all build
 * steps.
 */
@lombok.Data
public class Objects {
    private String location;
    private List<String> paths;
    private ObjectsTiming timing;
}
