package com.fanleagueent.fanleague.domain.models.user;

/**
 * Created by st1ch on 11.11.2016.
 */

public class PrivacyStatusEntity {

    private ProfileViewPermissionEntity profileViewPermissionEntity;
    private DisplayNameIdentEntity displayNameIdentEntity;


    public PrivacyStatusEntity(ProfileViewPermissionEntity profileViewPermissionEntity, DisplayNameIdentEntity displayNameIdentEntity) {
        this.profileViewPermissionEntity = profileViewPermissionEntity;
        this.displayNameIdentEntity = displayNameIdentEntity;
    }

    public ProfileViewPermissionEntity getProfileViewPermissionEntity() {
        return profileViewPermissionEntity;
    }

    public DisplayNameIdentEntity getDisplayNameIdentEntity() {
        return displayNameIdentEntity;
    }

    public void setDisplayNameIdentEntity(DisplayNameIdentEntity displayNameIdentEntity) {
        this.displayNameIdentEntity = displayNameIdentEntity;
    }

    public void setProfileViewPermissionEntity(ProfileViewPermissionEntity profileViewPermissionEntity) {
        this.profileViewPermissionEntity = profileViewPermissionEntity;
    }

    @Override
    public String toString() {
        return "PrivacyStatusEntity{" +
                "profileViewPermissionEntity=" + profileViewPermissionEntity +
                ", displayNameIdentEntity=" + displayNameIdentEntity +
                '}';
    }
}
