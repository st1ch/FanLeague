package com.fanleagueent.fanleague.data.net.requests.user;

import com.fanleagueent.fanleague.domain.models.user.DisplayNameIdent;
import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 11.11.2016.
 */

public class ChangeDisplayNameRequest {

    @SerializedName("display_name_ident")
    DisplayNameIdent displayNameIdent;

    public ChangeDisplayNameRequest(DisplayNameIdent displayNameIdent) {
        this.displayNameIdent = displayNameIdent;
    }

    public DisplayNameIdent getDisplayNameIdent() {
        return displayNameIdent;
    }

}
