package com.fanleagueent.fanleague.data.exception;

/**
 * Created by alexeyverbitskiy on 11/4/16.
 */
public class ServerException extends Throwable {

  private String message;
  private String title;

  public ServerException(String title, String message) {
    this.title = title;
    this.message = message;
  }


  @Override public String getMessage() {
    return message;
  }

  public String getTitle() {
    return title;
  }
}
