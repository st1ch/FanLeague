package com.fanleagueent.fanleague.data.entity.responses;

import java.util.List;

/**
 * Created by st1ch on 09.12.16.
 */

public class BaseDataResponse extends BaseResponse<List<Boolean>> {
    @Override
    public List<Boolean> getData() {
        return data;
    }
}
