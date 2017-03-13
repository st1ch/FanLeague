package com.fanleagueent.fanleague.domain.models.user;

/**
 * Created by st1ch on 09.11.2016.
 */

public class SocialAccountsStatus {

    private boolean facebookConnected;
    private boolean googleConnected;

    public SocialAccountsStatus(boolean facebookConnected, boolean googleConnected) {
        this.facebookConnected = facebookConnected;
        this.googleConnected = googleConnected;
    }

    public boolean isGoogleConnected() {
        return googleConnected;
    }

    public boolean isFacebookConnected() {
        return facebookConnected;
    }

    @Override
    public String toString() {
        return "SocialAccountsStatus{" +
                "facebookConnected=" + facebookConnected +
                ", googleConnected=" + googleConnected +
                '}';
    }
}
