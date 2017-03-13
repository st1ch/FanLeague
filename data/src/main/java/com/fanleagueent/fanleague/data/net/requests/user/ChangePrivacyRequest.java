package com.fanleagueent.fanleague.data.net.requests.user;

import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 11.11.2016.
 */

public class ChangePrivacyRequest {

    @SerializedName("profile_view_permission")
    ProfileViewPermission profileViewPermission;

    public ChangePrivacyRequest(ProfileViewPermission profileViewPermission) {
        this.profileViewPermission = profileViewPermission;
    }

    public ProfileViewPermission getProfileViewPermission() {
        return profileViewPermission;
    }
}
