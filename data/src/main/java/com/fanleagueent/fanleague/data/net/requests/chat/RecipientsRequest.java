package com.fanleagueent.fanleague.data.net.requests.chat;

import com.google.gson.annotations.SerializedName;

/**
 * Created by alexeyverbitskiy on 02/1/17.
 */

public class RecipientsRequest {

  @SerializedName("recipients") String recipientId;

  public RecipientsRequest(String recipientId) {
    this.recipientId = recipientId;
  }

}
