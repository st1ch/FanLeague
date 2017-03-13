package com.fanleagueent.fanleague.data.net.requests.fcm;

import com.google.gson.annotations.SerializedName;

public class FCMUnregisterRequest {

    @SerializedName("device_id")
    private String deviceId;

    public FCMUnregisterRequest(String deviceId) {
        this.deviceId = deviceId;
    }
}
