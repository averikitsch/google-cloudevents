package io.quicktype;

import java.time.OffsetDateTime;
import java.util.Map;

/**
 * An object within Google Cloud Storage.
 */
@lombok.Data
public class StorageObjectData {
    private String bucket;
    private String cacheControl;
    private Long componentCount;
    private String contentDisposition;
    private String contentEncoding;
    private String contentLanguage;
    private String contentType;
    private String crc32C;
    private CustomerEncryption customerEncryption;
    private String etag;
    private Boolean eventBasedHold;
    private Long generation;
    private String id;
    private String kind;
    private String kmsKeyName;
    private String md5Hash;
    private String mediaLink;
    private Map<String, String> metadata;
    private Long metageneration;
    private String name;
    private OffsetDateTime retentionExpirationTime;
    private String selfLink;
    private Long size;
    private String storageClass;
    private Boolean temporaryHold;
    private OffsetDateTime timeCreated;
    private OffsetDateTime timeDeleted;
    private OffsetDateTime timeStorageClassUpdated;
    private OffsetDateTime updated;
}
