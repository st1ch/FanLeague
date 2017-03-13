package com.fanleagueent.fanleague.data.constants;

public interface AppConfig {
  String DB_NAME = "Fanleague.db";
  int DB_VERSION = 1;
  String FILE_PROVIDER_NAME = "com.fanleagueent.fanleague.fileprovider";
  String FAN_IMAGE_FOLDER = "Fanleague_images";
  String NONE = "None";
  int MAX_FINANCIAL_LIMIT = 100;
  int MIN_NICKNAME_LENGTH = 4;
  int MIN_TEAM_LENGTH = 4;
  int MIN_LEAGUE_LENGTH = 4;
  int MIN_PASSWORD_LENGTH = 6;
  int MAX_USER_DATA_LENGTH = 20;
  int YEAR_VALIDATION = 18;
  int MAX_TEAM_MEMBERS_COUNT = 25;
  int MAX_LEAGUE_MEMBERS_COUNT = 100;

  float MIN_BET_AMOUNT = 0.2f;
  int HALFGUARD_BET_MULTIPLIER = 2;
  int FULLGUARD_BET_MULTIPLIER = 3;

  int LEVEL_ROOKIE = 0;
  int LEVEL_BRONZE = 1;
  int LEVEL_SILVER = 2;
  int LEVEL_GOLD = 3;
  int LEVEL_PLATINUM = 4;

  int PROGRESS_TYPE_SCORE = 10;
  int PROGRESS_TYPE_RECRUITING = 11;
  int PROGRESS_TYPE_TREE = 12;
  int PROGRESS_TYPE_LOYALTY = 13;
  int PROGRESS_TYPE_CONSISTENCY = 14;
}
