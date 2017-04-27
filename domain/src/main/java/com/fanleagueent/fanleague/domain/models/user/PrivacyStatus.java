package com.fanleagueent.fanleague.domain.models.user;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * Created by st1ch on 11.11.2016.
 */
@RequiredArgsConstructor @ToString
public class PrivacyStatus {
    @Getter @NonNull private ProfileViewPermission profileViewPermission;
    @Getter @NonNull private DisplayNameIdent displayNameIdent;
}
