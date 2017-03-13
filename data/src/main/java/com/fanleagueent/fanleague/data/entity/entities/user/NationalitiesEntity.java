package com.fanleagueent.fanleague.data.entity.entities.user;

import com.fanleagueent.fanleague.domain.models.user.DataTitle;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by alexeyverbitskiy on 11/4/16.
 */

public class NationalitiesEntity {
    @SerializedName("nationalities")
    List<DataTitle> dataTitles;

    public List<DataTitle> getDataTitles() {
        return dataTitles;
    }
}
