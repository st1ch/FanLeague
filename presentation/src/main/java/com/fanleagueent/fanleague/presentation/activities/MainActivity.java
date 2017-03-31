package com.fanleagueent.fanleague.presentation.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.fanleagueent.fanleague.domain.repository.ActivityHistoryRepository;
import com.fanleagueent.fanleague.domain.schedulers.ObserveOn;
import com.fanleagueent.fanleague.domain.schedulers.SubscribeOn;
import com.fanleagueent.fanleague.presentation.FanApplication;
import com.fanleagueent.fanleague.presentation.R;
import com.fanleagueent.fanleague.presentation.di.components.ActivityComponent;
import com.fanleagueent.fanleague.presentation.di.components.DaggerActivityComponent;
import com.fanleagueent.fanleague.presentation.di.components.DaggerUserComponent;
import com.fanleagueent.fanleague.presentation.di.components.UserComponent;
import com.fanleagueent.fanleague.presentation.di.modules.ActivityModule;
import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

  private static ActivityComponent activityComponent;

  @Inject ActivityHistoryRepository activityHistoryRepository;
  @Inject ObserveOn observeOn;
  @Inject SubscribeOn subscribeOn;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    activityComponent =
        DaggerActivityComponent.builder()
            .fanComponent(FanApplication.getFanComponent())
            .activityModule(new ActivityModule(this)).build();

    UserComponent userComponent = DaggerUserComponent.builder().activityComponent(activityComponent).build();

    //ActivityHistoryComponent activityHistoryComponent = DaggerActivityHistoryComponent.builder().userComponent(userComponent).build();
    //
    //activityHistoryComponent.inject(this);
    //
    //activityHistoryRepository.getHistoryFriends(0).observeOn(observeOn.getScheduler()).subscribeOn(subscribeOn.getScheduler()).subscribe(activityHistoryUsers -> Log.wtf("onNext",
    //    "onCreate: " + activityHistoryUsers.toString()), throwable -> Log.wtf("onError", "onCreate: " + throwable.getMessage()));
  }

  public static ActivityComponent getActivityComponent() {
    return activityComponent;
  }
}
