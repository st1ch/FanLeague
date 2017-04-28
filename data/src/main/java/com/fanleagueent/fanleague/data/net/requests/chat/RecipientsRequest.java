package com.fanleagueent.fanleague.data.net.requests.chat;

import com.google.gson.annotations.SerializedName;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * Created by alexeyverbitskiy on 02/1/17.
 */

@RequiredArgsConstructor public class RecipientsRequest {
  @SerializedName("recipients") @NonNull private String recipientId;
}
