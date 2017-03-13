package com.fanleagueent.fanleague.domain.models.friends;

import java.util.List;

/**
 * Created by alexeyverbitskiy on 11/15/16.
 */

public class FriendsData {

    private int friendsCount;
    private List<Friend> friendList;

    public int getFriendsCount() {
        return friendsCount;
    }

    public List<Friend> getFriendList() {
        return friendList;
    }
}
