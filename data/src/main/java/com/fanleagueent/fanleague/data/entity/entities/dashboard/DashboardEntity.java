package com.fanleagueent.fanleague.data.entity.entities.dashboard;

import com.fanleagueent.fanleague.data.entity.entities.chat.ChatDataEntity;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Getter;

/**
 * Created by alexeyverbitskiy on 3/28/17.
 */

public class DashboardEntity {
  @SerializedName("gameweek") @Getter private GameWeekDashboardEntity gameWeekDashboardEntity;

  @SerializedName("messenger_threads") @Getter private List<ChatDataEntity> chatDataList;

  @SerializedName("latest_score") @Getter private LatestScoreEntity latestScore;

  @SerializedName("community") @Getter private CommunityEntity communityEntity;

  @SerializedName("tutorials") @Getter private List<TutorialEntity> tutorialEntityList;

  @SerializedName("updates") @Getter private List<UpdateEntity> updateList;
}
