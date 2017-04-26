package com.fanleagueent.fanleague.data.exception;

/**
 * Created by Artem Getman on 24.04.17.
 * a.e.getman@gmail.com
 */

public class UnsupportedDataSourceOperationException extends UnsupportedOperationException {

  public UnsupportedDataSourceOperationException() {
    super("Operation is not available!!!");
  }
}
