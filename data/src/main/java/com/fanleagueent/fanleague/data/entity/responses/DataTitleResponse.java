package com.fanleagueent.fanleague.data.entity.responses;

/**
 * Created by alexeyverbitskiy on 10/24/16.
 */

public class DataTitleResponse<T> extends BaseResponse<T> {
    public T getDataTitleList() {
        return data;
    }
}
