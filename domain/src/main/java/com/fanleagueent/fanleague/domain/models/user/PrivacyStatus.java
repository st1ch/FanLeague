package com.fanleagueent.fanleague.domain.models.user;

/**
 * Created by st1ch on 11.11.2016.
 */

public class PrivacyStatus {

    private ProfileViewPermission profileViewPermission;
    private DisplayNameIdent displayNameIdent;

    public PrivacyStatus(ProfileViewPermission profileViewPermission, DisplayNameIdent displayNameIdent) {
        this.profileViewPermission = profileViewPermission;
        this.displayNameIdent = displayNameIdent;
    }

    public ProfileViewPermission getProfileViewPermission() {
        return profileViewPermission;
    }

    public DisplayNameIdent getDisplayNameIdent() {
        return displayNameIdent;
    }

    public void setDisplayNameIdent(DisplayNameIdent displayNameIdent) {
        this.displayNameIdent = displayNameIdent;
    }

    public void setProfileViewPermission(ProfileViewPermission profileViewPermission) {
        this.profileViewPermission = profileViewPermission;
    }

    @Override
    public String toString() {
        return "PrivacyStatusEntity{" +
                "profileViewPermissionEntity=" + profileViewPermission +
                ", displayNameIdentEntity=" + displayNameIdent +
                '}';
    }
}
