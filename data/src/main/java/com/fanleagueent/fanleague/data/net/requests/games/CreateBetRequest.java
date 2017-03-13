package com.fanleagueent.fanleague.data.net.requests.games;

import com.fanleagueent.fanleague.domain.models.games.MatchBet;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by st1ch on 22.12.16.
 */

public class CreateBetRequest {

    @SerializedName("matches")
    Map<String, int[]> matches;

    @SerializedName("is_remove_previous")
    boolean isRemove;

    public CreateBetRequest(Map<String, MatchBet> matches, boolean isRemove) {
        this.matches = new HashMap<>();
        for(String matchId : matches.keySet()){
            this.matches.put(matchId, matches.get(matchId).getBetValues());
        }
        this.isRemove = isRemove;
    }

    public Map<String, int[]> getMatches() {
        return matches;
    }

    public boolean isRemove() {
        return isRemove;
    }

    @Override
    public String toString() {
        return "CreateBetRequest{" +
                "matches=" + matches +
                ", isRemove=" + isRemove +
                '}';
    }
}
