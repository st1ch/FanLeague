package com.fanleagueent.fanleague.data.repository;

import com.fanleagueent.fanleague.data.exception.NetworkConnectionException;
import com.fanleagueent.fanleague.data.utils.ConnectionUtil;

/**
 * Created by Artem Getman on 28.04.17.
 * a.e.getman@gmail.com
 */

public abstract class BaseRemoteDataSource {

  private ConnectionUtil connectionUtil;

  protected BaseRemoteDataSource(ConnectionUtil connectionUtil) {
    this.connectionUtil = connectionUtil;
  }

  protected void checkConnection() throws NetworkConnectionException {
    if (!connectionUtil.isThereInternetConnection()) {
      throw new NetworkConnectionException();
    }
  }
}
