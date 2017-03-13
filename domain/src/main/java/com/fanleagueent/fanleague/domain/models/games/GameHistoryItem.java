package com.fanleagueent.fanleague.domain.models.games;

/**
 * Created by st1ch on 26.12.16.
 */

public class GameHistoryItem {

    private String homeTeamName;
    private String awayTeamName;
    private String date;
    private Result result;

    public GameHistoryItem() {
    }

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public void setHomeTeamName(String homeTeamName) {
        this.homeTeamName = homeTeamName;
    }

    public String getAwayTeamName() {
        return awayTeamName;
    }

    public void setAwayTeamName(String awayTeamName) {
        this.awayTeamName = awayTeamName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
