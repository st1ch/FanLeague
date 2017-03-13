package com.fanleagueent.fanleague.domain.models.friends;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by alexeyverbitskiy on 11/15/16.
 */

public class FriendsDataEntity {

    @SerializedName("friends_count")
    private int friendsCount;

    @SerializedName("friends")
    private List<FriendEntity> friendEntityList;

    public int getFriendsCount() {
        return friendsCount;
    }

    public List<FriendEntity> getFriendEntityList() {
        return friendEntityList;
    }
}
