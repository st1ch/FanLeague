package com.fanleagueent.fanleague.data.net.requests.chat;

import com.google.gson.annotations.SerializedName;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * Created by alexeyverbitskiy on 02/02/17.
 */

@RequiredArgsConstructor public class MessageRequest {
  @SerializedName("thread_id") @NonNull private String threadId;
  @SerializedName("message") @NonNull private String message;
}
