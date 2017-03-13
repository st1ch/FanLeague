package com.fanleagueent.fanleague.data.net.requests.chat;

import com.google.gson.annotations.SerializedName;

/**
 * Created by alexeyverbitskiy on 02/02/17.
 */

public class MessageRequest {

  @SerializedName("thread_id") String threadId;
  @SerializedName("message") String message;

  public MessageRequest(String threadId, String message) {
    this.threadId = threadId;
    this.message = message;
  }

}
