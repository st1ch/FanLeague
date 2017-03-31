package com.fanleagueent.fanleague.presentation;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;
import com.facebook.FacebookSdk;
import com.fanleagueent.fanleague.presentation.di.components.DaggerFanComponent;
import com.fanleagueent.fanleague.presentation.di.components.FanComponent;
import com.fanleagueent.fanleague.presentation.di.modules.ApplicationModule;

/**
 * Created by alexeyverbitskiy on 10/12/16.
 */

public class FanApplication extends Application {

  private static FanComponent fanComponent;

  @Override public void onCreate() {
    super.onCreate();

    FacebookSdk.sdkInitialize(getApplicationContext());

    fanComponent = DaggerFanComponent.builder().
        applicationModule(new ApplicationModule(getApplicationContext())).build();

   /* if (LeakCanary.isInAnalyzerProcess(this)) {
      return;
    }
    LeakCanary.install(this);*/
  }

  @Override protected void attachBaseContext(Context base) {
    super.attachBaseContext(base);
    MultiDex.install(this);
  }

  public static FanComponent getFanComponent() {
    return fanComponent;
  }
}
