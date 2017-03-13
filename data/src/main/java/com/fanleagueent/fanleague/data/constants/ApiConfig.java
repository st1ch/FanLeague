package com.fanleagueent.fanleague.data.constants;

public interface ApiConfig {
  int HTTP_TIMEOUT = 180000;
  String BASE_URL = "https://devapi.fanleague.com/";
  String WALLET_URL = "https://dev.fanleague.com/wallet/?temporary_key=";
  String TEAM_TOP_UP_URL = "https://dev.fanleague.com/wallet/top-up/?temporary_key=";
  String API_VERSION = "v1";
  String PUSH_ARG = "push";
  String EMAIL_ARG = "email";

  int FRIENDS_OFFSET_LIMIT = 30;
  int THREADS_OFFSET_LIMIT = 10;
  int LEAGUES_OFFSET_LIMIT = 5;
  int TEAMS_OFFSET_LIMIT = 5;
  int LEAGUE_MEMBERS_OFFSET_LIMIT = 20;
  int PUNDITS_POSTS_OFFSET_LIMIT = 20;
  int RECRUITING_INVITES_OFFSET_LIMIT = 20;
}
