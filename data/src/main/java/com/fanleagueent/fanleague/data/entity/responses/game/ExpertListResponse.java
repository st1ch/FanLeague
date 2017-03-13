package com.fanleagueent.fanleague.data.entity.responses.game;

import com.fanleagueent.fanleague.domain.models.games.Pundit;
import com.fanleagueent.fanleague.domain.models.responses.BaseResponse;
import java.util.List;

/**
 * Created by st1ch on 22.12.16.
 */

public class ExpertListResponse extends BaseResponse<List<Pundit>> {
    @Override
    public List<Pundit> getData() {
        return super.getData();
    }
}
