package com.fanleagueent.fanleague.data.net.requests.user;

import com.google.gson.annotations.SerializedName;

public class ChangePasswordRequest {

    @SerializedName("new_password")
    private final String password;

    @SerializedName("confirm_new_password")
    private final String confirmPassword;

    @SerializedName("password")
    private final String currentPassword;

    public ChangePasswordRequest(String password, String confirmPassword, String currentPassword) {
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.currentPassword = currentPassword;
    }
}
