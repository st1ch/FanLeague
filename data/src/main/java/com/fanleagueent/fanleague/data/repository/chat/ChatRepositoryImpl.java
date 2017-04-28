package com.fanleagueent.fanleague.data.repository.chat;

import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.data.entity.mappers.chat.ChatMapperFactory;
import com.fanleagueent.fanleague.data.entity.mappers.friends.FriendMapperFactory;
import com.fanleagueent.fanleague.data.repository.chat.datasource.ChatDataSource;
import com.fanleagueent.fanleague.domain.models.chat.ChatData;
import com.fanleagueent.fanleague.domain.models.chat.MessageData;
import com.fanleagueent.fanleague.domain.models.friends.Friend;
import com.fanleagueent.fanleague.domain.repository.ChatRepository;
import io.reactivex.Flowable;
import java.util.List;

/**
 * Created by Artem Getman on 28.04.17.
 * a.e.getman@gmail.com
 */

public class ChatRepositoryImpl implements ChatRepository {

  private ChatDataSource local;
  private ChatDataSource remote;
  private ChatMapperFactory chatMapperFactory;
  private FriendMapperFactory friendMapperFactory;

  public ChatRepositoryImpl(ChatDataSource local, ChatDataSource remote,
      MapperFactory mapperFactory) {
    this.local = local;
    this.remote = remote;
    this.chatMapperFactory = mapperFactory.chatMapperFactory();
    this.friendMapperFactory = mapperFactory.friendMapperFactory();
  }

  @Override public Flowable<List<ChatData>> getThreads(int offset) {
    return Flowable.concatArrayDelayError(local.getThreads(offset).toFlowable(),
        remote.getThreads(offset).compose(local.saveThreads(offset)).toFlowable())
        .filter(data -> data != null)
        .map(chatDataEntities -> chatMapperFactory.getChatDataListMapper()
            .transform(chatDataEntities));
  }

  @Override public Flowable<ChatData> createThread(String recipientId) {
    return remote.createThread(recipientId)
        .toFlowable()
        .filter(data -> data != null)
        .map(chatDataEntity -> chatMapperFactory.getChatDataMapper().transform(chatDataEntity));
  }

  @Override public Flowable<List<ChatData>> searchThreads(String searchQuery) {
    return remote.searchThreads(searchQuery)
        .toFlowable()
        .filter(data -> data != null)
        .map(chatDataEntities -> chatMapperFactory.getChatDataListMapper()
            .transform(chatDataEntities));
  }

  @Override public Flowable<List<ChatData>> searchSuggestions() {
    return remote.searchSuggestions()
        .toFlowable()
        .filter(data -> data != null)
        .map(chatDataEntities -> chatMapperFactory.getChatDataListMapper()
            .transform(chatDataEntities));
  }

  @Override public Flowable<MessageData> newMessage(String threadId, String message) {
    return remote.newMessage(threadId, message)
        .toFlowable()
        .filter(data -> data != null)
        .map(messageDataEntity -> chatMapperFactory.getMessageDataMapper()
            .transform(messageDataEntity));
  }

  @Override public Flowable<MessageData> getThreadMessages(String threadId) {
    return remote.getThreadMessages(threadId)
        .toFlowable()
        .filter(data -> data != null)
        .map(messageDataEntity -> chatMapperFactory.getMessageDataMapper()
            .transform(messageDataEntity));
  }

  @Override
  public Flowable<MessageData> getOldThreadMessagesByTimestamp(String threadId, long timestamp) {
    return remote.getOldThreadMessagesByTimestamp(threadId, timestamp)
        .toFlowable()
        .filter(data -> data != null)
        .map(messageDataEntity -> chatMapperFactory.getMessageDataMapper()
            .transform(messageDataEntity));
  }

  @Override public Flowable<List<Friend>> getAllFriends(int offset) {
    return Flowable.concatArrayDelayError(local.getAllFriends(offset).toFlowable(),
        remote.getAllFriends(offset).compose(local.saveAllFriends(offset)).toFlowable())
        .filter(data -> data != null)
        .map(friendEntities -> friendMapperFactory.getFriendListMapper().transform(friendEntities));
  }

  @Override public Flowable<List<Friend>> searchFriends(String searchQuery, int offset) {
    return remote.searchFriends(searchQuery, offset)
        .toFlowable()
        .filter(data -> data != null)
        .map(friendEntities -> friendMapperFactory.getFriendListMapper().transform(friendEntities));
  }
}
