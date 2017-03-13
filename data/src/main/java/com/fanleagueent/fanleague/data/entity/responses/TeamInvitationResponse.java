package com.fanleagueent.fanleague.data.entity.responses;

import com.fanleagueent.fanleague.domain.models.teams.InvitationData;

/**
 * Created by st1ch on 01.12.16.
 */

public class TeamInvitationResponse extends BaseResponse<InvitationData>{

    public InvitationData getInvitationData() {
        return super.getData();
    }
}
