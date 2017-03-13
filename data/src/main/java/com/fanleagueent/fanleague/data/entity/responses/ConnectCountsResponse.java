package com.fanleagueent.fanleague.data.entity.responses;


import com.fanleagueent.fanleague.domain.models.user.ConnectCounts;

/**
 * Created by alexeyverbitskiy on 10/24/16.
 */

public class ConnectCountsResponse extends BaseResponse<ConnectCounts> {

    public ConnectCounts getConnectCounts() {
        return data;
    }
}
