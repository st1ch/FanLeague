package com.fanleagueent.fanleague.domain.repository;

import com.fanleagueent.fanleague.domain.models.chat.ChatData;
import com.fanleagueent.fanleague.domain.models.chat.MessageData;
import com.fanleagueent.fanleague.domain.models.friends.Friend;
import io.reactivex.Flowable;
import java.util.List;

/**
 * Created by Artem Getman on 28.04.17.
 * a.e.getman@gmail.com
 */

public interface ChatRepository {

  Flowable<List<ChatData>> getThreads(int offset);

  Flowable<ChatData> createThread(String recipientId);

  Flowable<List<ChatData>> searchThreads(String searchQuery);

  Flowable<List<ChatData>> searchSuggestions();

  Flowable<MessageData> newMessage(String threadId, String message);

  Flowable<MessageData> getThreadMessages(String threadId);

  Flowable<MessageData> getOldThreadMessagesByTimestamp(String threadId, long timestamp);

  Flowable<List<Friend>> getAllFriends(int offset);

  Flowable<List<Friend>> searchFriends(String searchQuery, int offset);
}
