package com.fanleagueent.fanleague.data.net.requests.user;

import com.google.gson.annotations.SerializedName;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor public class ChangePasswordRequest {

  @SerializedName("new_password") @NonNull private final String password;

  @SerializedName("confirm_new_password") @NonNull private final String confirmPassword;

  @SerializedName("password") @NonNull private final String currentPassword;
}
