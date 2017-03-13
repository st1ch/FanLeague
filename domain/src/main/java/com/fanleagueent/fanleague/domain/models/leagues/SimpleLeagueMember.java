package com.fanleagueent.fanleague.domain.models.leagues;

/**
 * Created by alexeyverbitskiy on 12/20/16.
 */

public class SimpleLeagueMember {

    protected String id;
    protected String displayName;
    protected boolean isAdmin;
    protected boolean isOwner;

    public String getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public boolean isOwner() {
        return isOwner;
    }
}
