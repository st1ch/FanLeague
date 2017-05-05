package com.fanleagueent.fanleague.data.repository.fcm;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.fanleagueent.fanleague.data.net.api.FCMRegistrationAPI;
import com.fanleagueent.fanleague.data.net.requests.fcm.FCMRegisterRequest;
import com.fanleagueent.fanleague.data.observables.BaseResponseObservable;
import com.fanleagueent.fanleague.domain.repository.FCMService;
import io.reactivex.Flowable;

/**
 * Created by alexeyverbitskiy on 3/7/17.
 */

public class FCMServiceImpl implements FCMService {

  private Context context;
  private FCMRegistrationAPI api;

  public FCMServiceImpl(Context context, FCMRegistrationAPI api) {
    this.context = context;
    this.api = api;
  }

  @Override public Flowable<Boolean> registrationFCM(@NonNull String token) {
    FCMRegisterRequest fcmRegisterRequest =
        new FCMRegisterRequest(token, getDeviceUniqueId(), getDeviceName(), getVersionOS());
    return api.registerDevice(fcmRegisterRequest)
        .flatMap(BaseResponseObservable::new)
        .map(r -> !r.isError())
        .toFlowable();
  }

  @Override public Flowable<Boolean> unregisterFCM() {
    return api.unregisterDevice(getDeviceUniqueId())
        .flatMap(BaseResponseObservable::new)
        .map(r -> !r.isError())
        .toFlowable();
  }

  private String getVersionOS() {
    return Build.VERSION.RELEASE;
  }

  private String getDeviceUniqueId() {
    return Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
  }

  private String getDeviceName() {
    String manufacturer = Build.MANUFACTURER;
    String model = Build.MODEL;
    if (model.startsWith(manufacturer)) {
      return capitalize(model);
    }
    return capitalize(manufacturer) + " " + model;
  }

  private String capitalize(String str) {
    if (TextUtils.isEmpty(str)) {
      return str;
    }
    char[] arr = str.toCharArray();
    boolean capitalizeNext = true;

    StringBuilder phrase = new StringBuilder();
    for (char c : arr) {
      if (capitalizeNext && Character.isLetter(c)) {
        phrase.append(Character.toUpperCase(c));
        capitalizeNext = false;
        continue;
      } else if (Character.isWhitespace(c)) {
        capitalizeNext = true;
      }
      phrase.append(c);
    }

    return phrase.toString();
  }
}
