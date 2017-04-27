package com.fanleagueent.fanleague.domain.models.user;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Builder;

/**
 * Created by alexeyverbitskiy on 11/8/16.
 */
@Builder
public class UserGeneralData {
  @Getter @Setter private User user;
  @Getter @Setter private List<DataTitle> professionList;
  @Getter @Setter private List<DataTitle> nationalityList;
  @Getter @Setter private List<FavoriteClub> favoriteClubList;
}
