package com.fanleagueent.fanleague.presentation.di.components;

import android.content.Context;
import android.content.SharedPreferences;
import com.fanleagueent.fanleague.data.cache.PreferenceHelper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.schedulers.ObserveOn;
import com.fanleagueent.fanleague.domain.schedulers.SubscribeOn;
import com.fanleagueent.fanleague.presentation.di.modules.SettingsModule;
import com.fanleagueent.fanleague.presentation.di.scopes.SettingsScope;
import com.fanleagueent.fanleague.presentation.utils.DateUtils;
import com.fanleagueent.fanleague.presentation.utils.FanUtils;
import com.fanleagueent.fanleague.presentation.utils.ImageLoaderHelper;
import com.google.gson.Gson;
import dagger.Component;
import io.reactivecache2.ReactiveCache;

/**
 * Created by alexeyverbitskiy on 9/20/16.
 */
@SettingsScope @Component(dependencies = ActivityComponent.class, modules = {
    SettingsModule.class
}) public interface UserComponent {
  ///**
  // * Activities
  // */
  //void inject(AbstractMenuActivity abstractMenuActivity);
  //
  //void inject(MainActivity mainActivity);
  //
  ///**
  // * Fragments
  // */
  //void inject(DashboardFragment dashboardFragment);
  //
  //void inject(SettingsFragment settingsFragment);
  //
  //void inject(MainMenuFragment mainMenuFragment);
  //
  //void inject(SecurityFragment securityFragment);
  //
  //void inject(SocialAccountsFragment socialAccountsFragment);
  //
  //void inject(PersonalDetailsFragment personalDetailsFragment);
  //
  //void inject(NotificationsFragment notificationsFragment);
  //
  //void inject(PushFragment pushFragment);
  //
  //void inject(EmailFragment emailFragment);
  //
  //void inject(PrivacyFragment privacyFragment);
  //
  //void inject(ChangeEmailFragment changeEmailFragment);
  //
  //void inject(ChangePasswordFragment changePasswordFragment);
  //
  //void inject(WalletFragment walletFragment);

  //DialogHelper dialogHelper();
  //
  //Context context();
  //
  //Gson gson();
  //
  //SharedPreferences sharedPreferences();
  //
  //PreferenceHelper preferenceHelper();

//  ImageLoaderHelper imageLoaderHelper();

//  FanDbHelper fanDbHelper();

  //UserRepository userRepository();
  //
  //SubscribeOn subscribeOn();
  //
  //ObserveOn observerOn();
  //
  //AbstractMapperFactory mapperFactory();
  //
  //FragmentNavigator fragmentNavigator();
  //
  //ReactiveCache reactiveCache();
  //
  //GoogleApiClient googleApiClient();
  //
  //AppCompatActivity activity();
  //
  //MainActivityPresenter mainActivityPresenter();
  //
  //MainMenuPresenter mainMenuPresenter();
  //
  //DashboardPresenter dashboardPresenter();
  //
  //DashboardRepository dashboardRepository();
  //
  //SystemMessagesPresenter systemMessagesPresenter();
  //
  //PunditBetRxBus punditBetRxBus();
  //
  //NewMessageRxBus newMessageRxBus();
  //
  //NewThreadRxBus newThreadRxBus();
  //
  //MatchScoreChangedRxBus matchScoreChangedRxBus();
  //
  //SystemMessageRxBus systemMessageRxBus();

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

}
