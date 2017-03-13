package com.fanleagueent.fanleague.domain.models.teams;

import android.support.annotation.NonNull;
import com.fanleagueent.fanleague.data.entity.entities.MemberEntity;

/**
 * Created by st1ch on 01.12.16.
 */

public class TeamMemberEntityEntity extends MemberEntity
    implements Comparable<TeamMemberEntityEntity> {

    @Override
    public int compareTo(@NonNull TeamMemberEntityEntity teamMemberEntity) {
        return id.compareTo(teamMemberEntity.getId());
    }
}
