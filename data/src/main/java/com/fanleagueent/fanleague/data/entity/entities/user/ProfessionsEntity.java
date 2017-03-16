package com.fanleagueent.fanleague.data.entity.entities.user;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by alexeyverbitskiy on 11/4/16.
 */

public class ProfessionsEntity {
    @SerializedName("professions")
    List<DataTitleEntity> dataTitles;

    public List<DataTitleEntity> getDataTitles() {
        return dataTitles;
    }
}
