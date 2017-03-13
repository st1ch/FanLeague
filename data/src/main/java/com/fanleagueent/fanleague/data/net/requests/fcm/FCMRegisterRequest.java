package com.fanleagueent.fanleague.data.net.requests.fcm;

import com.google.gson.annotations.SerializedName;

public class FCMRegisterRequest {

    @SerializedName("token")
    private String token;

    @SerializedName("device_id")
    private String deviceId;

    @SerializedName("device_model")
    private String deviceModel;

    @SerializedName("system_version")
    private String systemVersion;

    public FCMRegisterRequest(String token, String deviceId, String deviceModel, String systemVersion) {
        this.token = token;
        this.deviceId = deviceId;
        this.deviceModel = deviceModel;
        this.systemVersion = systemVersion;
    }
}
