package io.quicktype;

import java.io.IOException;

public enum MqttStateEnum {
    MQTT_DISABLED, MQTT_ENABLED, MQTT_STATE_UNSPECIFIED;

    public String toValue() {
        switch (this) {
            case MQTT_DISABLED: return "MQTT_DISABLED";
            case MQTT_ENABLED: return "MQTT_ENABLED";
            case MQTT_STATE_UNSPECIFIED: return "MQTT_STATE_UNSPECIFIED";
        }
        return null;
    }

    public static MqttStateEnum forValue(String value) throws IOException {
        if (value.equals("MQTT_DISABLED")) return MQTT_DISABLED;
        if (value.equals("MQTT_ENABLED")) return MQTT_ENABLED;
        if (value.equals("MQTT_STATE_UNSPECIFIED")) return MQTT_STATE_UNSPECIFIED;
        throw new IOException("Cannot deserialize MqttStateEnum");
    }
}
