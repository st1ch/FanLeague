package com.fanleagueent.fanleague.data.repository.chat.datasource;

import com.fanleagueent.fanleague.data.constants.CacheTitle;
import com.fanleagueent.fanleague.data.entity.entities.chat.ChatDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.chat.MessageDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.friends.FriendEntity;
import com.fanleagueent.fanleague.data.exception.UnsupportedDataSourceOperationException;
import io.reactivecache2.ProviderGroupList;
import io.reactivecache2.ReactiveCache;
import io.reactivex.Maybe;
import io.reactivex.MaybeTransformer;
import java.util.List;

/**
 * Created by Artem Getman on 28.04.17.
 * a.e.getman@gmail.com
 */

public class ChatLocalDataSource implements ChatDataSource {

  private final ProviderGroupList<ChatDataEntity> threadListProvider;
  private final ProviderGroupList<FriendEntity> friendListProvider;

  public ChatLocalDataSource(final ReactiveCache reactiveCache) {
    this.threadListProvider =
        reactiveCache.<ChatDataEntity>providerGroupList().withKey(CacheTitle.Chat.THREADS);
    this.friendListProvider =
        reactiveCache.<FriendEntity>providerGroupList().withKey(CacheTitle.Friends.FRIENDS_LIST);
  }

  @Override public Maybe<List<ChatDataEntity>> getThreads(int offset) {
    return threadListProvider.read(offset).toMaybe();
  }

  @Override
  public MaybeTransformer<List<ChatDataEntity>, List<ChatDataEntity>> saveThreads(int offset) {
    return upstream -> upstream.toSingle().compose(threadListProvider.replace(offset)).toMaybe();
  }

  @Override public Maybe<ChatDataEntity> createThread(String recipientId) {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<List<ChatDataEntity>> searchThreads(String searchQuery) {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<List<ChatDataEntity>> searchSuggestions() {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<MessageDataEntity> newMessage(String threadId, String message) {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<MessageDataEntity> getThreadMessages(String threadId) {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override
  public Maybe<MessageDataEntity> getOldThreadMessagesByTimestamp(String threadId, long timestamp) {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<List<FriendEntity>> getAllFriends(int offset) {
    return friendListProvider.read(offset).toMaybe();
  }

  @Override
  public MaybeTransformer<List<FriendEntity>, List<FriendEntity>> saveAllFriends(int offset) {
    return upstream -> upstream.toSingle().compose(friendListProvider.replace(offset)).toMaybe();
  }

  @Override public Maybe<List<FriendEntity>> searchFriends(String searchQuery, int offset) {
    throw new UnsupportedDataSourceOperationException();
  }
}
