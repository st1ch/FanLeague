package com.fanleagueent.fanleague.data.entity.responses;


import com.fanleagueent.fanleague.domain.models.user.UserData;

/**
 * Created by alexeyverbitskiy on 10/24/16.
 */

public class UserResponse extends BaseResponse<UserData> {

    public UserData getUserData() {
        return data;
    }
}
