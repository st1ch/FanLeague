package com.fanleagueent.fanleague.data.entity.responses;

import com.fanleagueent.fanleague.data.entity.entities.authorization.AuthorizationEntity;

public class AuthorizationResponse extends BaseResponse<AuthorizationEntity> {
    public AuthorizationEntity getAuthorization(){
        return data;
    }
}
