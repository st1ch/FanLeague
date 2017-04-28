package com.fanleagueent.fanleague.data.repository.chat.datasource;

import com.fanleagueent.fanleague.data.entity.entities.chat.ChatDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.chat.MessageDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.friends.FriendEntity;
import io.reactivex.Maybe;
import io.reactivex.MaybeTransformer;
import java.util.List;

/**
 * Created by Artem Getman on 28.04.17.
 * a.e.getman@gmail.com
 */

public interface ChatDataSource {
  Maybe<List<ChatDataEntity>> getThreads(int offset);

  MaybeTransformer<List<ChatDataEntity>, List<ChatDataEntity>> saveThreads(int offset);

  Maybe<ChatDataEntity> createThread(String recipientId);

  Maybe<List<ChatDataEntity>> searchThreads(String searchQuery);

  Maybe<List<ChatDataEntity>> searchSuggestions();

  Maybe<MessageDataEntity> newMessage(String threadId, String message);

  Maybe<MessageDataEntity> getThreadMessages(String threadId);

  Maybe<MessageDataEntity> getOldThreadMessagesByTimestamp(String threadId, long timestamp);

  Maybe<List<FriendEntity>> getAllFriends(int offset);

  MaybeTransformer<List<FriendEntity>, List<FriendEntity>> saveAllFriends(int offset);

  Maybe<List<FriendEntity>> searchFriends(String searchQuery, int offset);
}
