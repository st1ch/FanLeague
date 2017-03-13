package com.fanleagueent.fanleague.data.entity.responses;

import com.fanleagueent.fanleague.domain.models.DataTitle;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by alexeyverbitskiy on 11/4/16.
 */

public class NationalityResponse {
    @SerializedName("nationalities")
    List<DataTitle> dataTitles;

    public List<DataTitle> getDataTitles() {
        return dataTitles;
    }
}
