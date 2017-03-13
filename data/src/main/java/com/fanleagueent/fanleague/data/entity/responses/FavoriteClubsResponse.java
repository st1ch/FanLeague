package com.fanleagueent.fanleague.data.entity.responses;

import com.fanleagueent.fanleague.domain.models.user.FavoriteClubData;

/**
 * Created by alexeyverbitskiy on 11/4/16.
 */

public class FavoriteClubsResponse extends BaseResponse<FavoriteClubData> {

    public FavoriteClubData getFavoriteClubsData() {
        return data;
    }
}
