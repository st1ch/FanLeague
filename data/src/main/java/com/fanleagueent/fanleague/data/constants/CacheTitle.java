package com.fanleagueent.fanleague.data.constants;

/**
 * Created by Artem Getman on 26.04.17.
 * a.e.getman@gmail.com
 */

public interface CacheTitle {

  interface ActivityHistory {
    String ALL_HISTORY = "allHistoryCache";
    String FRIENDS_HISTORY = "friendsHistoryCache";
    String TEAMS_HISTORY = "teamsHistoryCache";
    String LEAGUES_HISTORY = "leaguesHistoryCache";
    String BETS_HISTORY = "betsHistoryCache";
  }

  interface User {
    String USER = "userCache";
    String PROFESSIONS = "professionsCache";
    String NATIONALITIES = "nationalitiesCache";
    String COUNTRIES = "countriesCache";
    String FAVOURITE_CLUB = "favouriteClubCache";
    String CONNECT_COUNTS = "connectCountsCache";
    String SYSTEM_MESSAGES = "systemMessagesCache";
    String UNREAD_MESSAGES = "unreadMessagesCache";
  }

  interface Dashboard {
    String DASHBOARD = "dashboardCache";
    String INVITE_LINK = "inviteLinkCache";
  }

  interface Chat {
    String THREADS = "chatThreadsCache";
  }

  interface Friends {
    String FRIENDS_LIST = "allFriendsListCache";
  }
}
