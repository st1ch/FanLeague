package com.fanleagueent.fanleague.presentation.di.modules;

import android.content.Context;
import android.content.SharedPreferences;
import com.fanleagueent.fanleague.data.cache.PreferenceHelper;
import com.fanleagueent.fanleague.data.constants.Preferences;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactoryImpl;
import com.fanleagueent.fanleague.data.net.ApiManager;
import com.fanleagueent.fanleague.data.net.interceptors.HeaderAuthInterceptor;
import com.fanleagueent.fanleague.domain.schedulers.ObserveOn;
import com.fanleagueent.fanleague.domain.schedulers.SubscribeOn;
import com.fanleagueent.fanleague.presentation.utils.DateUtils;
import com.fanleagueent.fanleague.presentation.utils.FanUtils;
import com.fanleagueent.fanleague.presentation.utils.ImageLoaderHelper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dagger.Module;
import dagger.Provides;
import io.reactivecache2.ReactiveCache;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.victoralbertos.jolyglot.GsonSpeaker;
import javax.inject.Singleton;

@Module public class ApplicationModule {

  private Context mContext;

  public ApplicationModule(Context context) {
    mContext = context;
  }

  @Provides @Singleton Context getContext() {
    return mContext;
  }

  @Provides SubscribeOn provideSubscribeOn() {
    return Schedulers::io;
  }

  @Provides ObserveOn provideObserverOn() {
    return AndroidSchedulers::mainThread;
  }

  @Provides @Singleton Gson getGson() {
    return new GsonBuilder().serializeNulls().create();
  }

  @Provides @Singleton SharedPreferences provideSharedPreference(Context context) {
    return context.getSharedPreferences(Preferences.PREFS_APP_DATA, Context.MODE_PRIVATE);
  }

  @Provides @Singleton PreferenceHelper providePreferenceHelper(
      SharedPreferences sharedPreferences) {
    return new PreferenceHelper(sharedPreferences);
  }

  @Provides @Singleton ImageLoaderHelper provideImageLoaderHelper(Context context,
      ObserveOn observeOn) {
    return new ImageLoaderHelper(context, observeOn);
  }

  @Provides @Singleton FanUtils provideFanUtils(Context context) {
    return new FanUtils(context);
  }

  @Provides @Singleton DateUtils provideDateUtils(Context context) {
    return new DateUtils(context);
  }

  @Provides @Singleton ReactiveCache provideReactiveCache(Context context) {
    return new ReactiveCache.Builder().using(context.getFilesDir(), new GsonSpeaker());
  }

  @Provides @Singleton ApiManager provideApiManager(Gson gson, HeaderAuthInterceptor headerAuthInterceptor) {
    return new ApiManager(gson, headerAuthInterceptor);
  }

  @Provides @Singleton MapperFactory provideMapperFactory() {
    return new MapperFactoryImpl();
  }
}
