package com.fanleagueent.fanleague.data.entity.responses;

import com.fanleagueent.fanleague.domain.models.friends.FriendsData;

/**
 * Created by alexeyverbitskiy on 11/15/16.
 */

public class FriendsResponse extends BaseResponse<FriendsData>{
    public FriendsData getFriendsData() {
        return data;
    }
}
