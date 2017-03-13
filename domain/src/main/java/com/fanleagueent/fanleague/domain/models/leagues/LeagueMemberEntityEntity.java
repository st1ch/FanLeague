package com.fanleagueent.fanleague.domain.models.leagues;

import com.fanleagueent.fanleague.data.entity.entities.MemberEntity;

/**
 * Created by alexeyverbitskiy on 12/8/16.
 */

public class LeagueMemberEntityEntity extends MemberEntity
    implements Comparable<LeagueMemberEntityEntity>{
    @Override
    public int compareTo(LeagueMemberEntityEntity leagueMemberEntity) {
        return id.compareTo(leagueMemberEntity.getId());
    }
}
