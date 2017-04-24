package com.fanleagueent.fanleague.presentation.di.components;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import com.fanleagueent.fanleague.data.cache.PreferenceHelper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.data.net.ApiManager;
import com.fanleagueent.fanleague.data.utils.ConnectionUtil;
import com.fanleagueent.fanleague.domain.schedulers.ObserveOn;
import com.fanleagueent.fanleague.domain.schedulers.SubscribeOn;
import com.fanleagueent.fanleague.presentation.di.modules.ActivityModule;
import com.fanleagueent.fanleague.presentation.di.scopes.PerActivity;
import com.fanleagueent.fanleague.presentation.utils.DateUtils;
import com.fanleagueent.fanleague.presentation.utils.DialogHelper;
import com.fanleagueent.fanleague.presentation.utils.FanUtils;
import com.fanleagueent.fanleague.presentation.utils.ImageLoaderHelper;
import com.google.gson.Gson;
import dagger.Component;
import io.reactivecache2.ReactiveCache;

/**
 * A base component upon which fragment's components may depend.
 * Activity-level components should extend this component.
 *
 * Subtypes of ActivityComponent should be decorated with annotation:
 */
@PerActivity @Component(dependencies = FanComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

  AppCompatActivity activity();

  DialogHelper dialogHelper();

  Context context();

  SubscribeOn subscribeOn();

  ObserveOn observerOn();

  Gson gson();

  PreferenceHelper preferenceHelper();

  ImageLoaderHelper imageLoaderHelper();

  FanUtils fanUtils();

  DateUtils dateUtils();

  ConnectionUtil connectionUtil();

  SharedPreferences sharedPreferences();

  ReactiveCache reactiveCache();

  MapperFactory mapperFactory();

  ApiManager apiManager();
}
