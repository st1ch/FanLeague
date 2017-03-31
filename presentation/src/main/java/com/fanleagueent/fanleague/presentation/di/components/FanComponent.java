package com.fanleagueent.fanleague.presentation.di.components;

import android.content.Context;
import android.content.SharedPreferences;
import com.fanleagueent.fanleague.data.cache.PreferenceHelper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.schedulers.ObserveOn;
import com.fanleagueent.fanleague.domain.schedulers.SubscribeOn;
import com.fanleagueent.fanleague.presentation.di.modules.ApplicationModule;
import com.fanleagueent.fanleague.presentation.utils.DateUtils;
import com.fanleagueent.fanleague.presentation.utils.FanUtils;
import com.fanleagueent.fanleague.presentation.utils.ImageLoaderHelper;
import com.google.gson.Gson;
import dagger.Component;
import io.reactivecache2.ReactiveCache;
import javax.inject.Singleton;

/**
 * Created by alexeyverbitskiy on 9/20/16.
 */
@Singleton @Component(modules = {
     ApplicationModule.class
    // GoogleApiClientModule.class , FCMModule.class
}) public interface FanComponent {

  /**
   * Injects of Activities
   */
  //void inject(LauncherActivity activity);
  //
  //void inject(WelcomeActivity activity);
  //
  //void inject(FanTextView fanTextView);
  //
  //void inject(FanEditText fanEditText);
  //
  //void inject(FanleagueFirebaseInstanceIDService fanleagueFirebaseInstanceIDService);
  //void inject(FanleagueFirebaseMessagingService fanleagueFirebaseMessagingService);

  /**
   * Injects of receiver
   */
  //void inject(ConnectionStateBroadcastReceiver connectionStateBroadcastReceiver);

  Context context();

  SubscribeOn subscribeOn();

  ObserveOn observerOn();

  Gson gson();

  PreferenceHelper preferenceHelper();

  ImageLoaderHelper imageLoaderHelper();

  FanUtils fanUtils();

  DateUtils dateUtils();

  SharedPreferences sharedPreferences();

  ReactiveCache reactiveCache();

  MapperFactory mapperFactory();

  //UserRepository userRepository();

  //FragmentNavigator fragmentNavigator();

  //GoogleApiClient googleApiClient();

  //MainActivityPresenter mainActivityPresenter();
  //
  //MainMenuPresenter mainMenuPresenter();
  //
  //DashboardPresenter dashboardPresenter();
  //
  //DashboardRepository dashboardRepository();
  //
  //FCMService fcmService();
  //
  //FCMRegistrationAPI fcmRegistrationApi();
  //
  //FCMRegistrationPresenter fcmRegistrationPresenter();
  //
  //SystemMessagesPresenter systemMessagesPresenter();
  //
  //NewMessageRxBus newMessageRxBus();
  //
  //NewThreadRxBus newThreadRxBus();
  //
  //MatchScoreChangedRxBus matchScoreChangedRxBus();
  //
  //SystemMessageRxBus systemMessageRxBus();

}
