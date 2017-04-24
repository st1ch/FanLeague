package com.fanleagueent.fanleague.data.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Artem Getman on 24.04.17.
 * a.e.getman@gmail.com
 */

@Singleton
public class ConnectionUtil {

  private Context context;

  @Inject ConnectionUtil(Context context) {
    this.context = context;
  }

  /**
   * Checks if the device has any active internet connection.
   *
   * @return true device with internet connection, otherwise false.
   */
  public boolean isThereInternetConnection() {
    boolean isConnected;

    ConnectivityManager connectivityManager =
        (ConnectivityManager) this.context.getSystemService(Context.CONNECTIVITY_SERVICE);
    NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
    isConnected = (networkInfo != null && networkInfo.isConnectedOrConnecting());

    return isConnected;
  }
}
