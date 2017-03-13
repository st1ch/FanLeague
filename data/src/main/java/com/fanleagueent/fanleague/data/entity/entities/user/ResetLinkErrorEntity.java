package com.fanleagueent.fanleague.data.entity.entities.user;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by alexeyverbitskiy on 10/24/16.
 */

public class ResetLinkErrorEntity {
    @SerializedName("email")
    private List<String> messageEmail;

    public String getMessageEmail() {
        return messageEmail != null && !messageEmail.isEmpty() ? messageEmail.get(0) : "";
    }
}
