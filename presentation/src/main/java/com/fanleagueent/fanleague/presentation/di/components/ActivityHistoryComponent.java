package com.fanleagueent.fanleague.presentation.di.components;

import com.fanleagueent.fanleague.presentation.activities.MainActivity;
import com.fanleagueent.fanleague.presentation.di.modules.ActivityHistoryModule;
import com.fanleagueent.fanleague.presentation.di.scopes.ActivityHistoryScope;
import dagger.Component;

/**
 * Created by alexeyverbitskiy on 3/2/17.
 */
@ActivityHistoryScope @Component(dependencies = UserComponent.class, modules = { ActivityHistoryModule.class })
public interface ActivityHistoryComponent {

  void inject(MainActivity mainActivity);

  //void inject(ActivityHistoryBaseFragment activityHistoryBaseFragment);
  //void inject(ActivityHistoryAllFragment activityHistoryAllFragment);
  //void inject(ActivityHistoryBetsFragment activityHistoryBetsFragment);
  //void inject(ActivityHistoryFriendsFragment activityHistoryFriendsFragment);
  //void inject(ActivityHistoryTeamsFragment activityHistoryTeamsFragment);
  //void inject(ActivityHistoryLeaguesFragment activityHistoryLeaguesFragment);
}
