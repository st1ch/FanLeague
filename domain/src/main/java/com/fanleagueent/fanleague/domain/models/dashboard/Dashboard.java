package com.fanleagueent.fanleague.domain.models.dashboard;

import com.fanleagueent.fanleague.domain.models.chat.ChatData;
import java.util.List;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Builder;

/**
 * Created by alexeyverbitskiy on 3/28/17.
 */
@Builder @ToString public class Dashboard {
  @Getter private GameWeekDashboard gameWeekDashboard;
  @Getter private List<ChatData> chatDataList;
  @Getter private LatestScore latestScore;
  @Getter private Community community;
  @Getter private List<Tutorial> tutorialList;
  @Getter private List<Update> updateList;
}
