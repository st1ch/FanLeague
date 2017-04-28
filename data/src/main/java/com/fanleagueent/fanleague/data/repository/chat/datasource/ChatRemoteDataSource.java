package com.fanleagueent.fanleague.data.repository.chat.datasource;

import com.fanleagueent.fanleague.data.entity.BaseResponse;
import com.fanleagueent.fanleague.data.entity.entities.chat.ChatDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.chat.MessageDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.friends.FriendEntity;
import com.fanleagueent.fanleague.data.exception.NetworkConnectionException;
import com.fanleagueent.fanleague.data.exception.UnsupportedDataSourceOperationException;
import com.fanleagueent.fanleague.data.net.api.ChatAPI;
import com.fanleagueent.fanleague.data.net.requests.chat.MessageRequest;
import com.fanleagueent.fanleague.data.net.requests.chat.RecipientsRequest;
import com.fanleagueent.fanleague.data.observables.BaseResponseObservable;
import com.fanleagueent.fanleague.data.repository.BaseRemoteDataSource;
import com.fanleagueent.fanleague.data.utils.ConnectionUtil;
import io.reactivex.Maybe;
import io.reactivex.MaybeTransformer;
import java.util.List;

/**
 * Created by Artem Getman on 28.04.17.
 * a.e.getman@gmail.com
 */

public class ChatRemoteDataSource extends BaseRemoteDataSource implements ChatDataSource {

  private ChatAPI chatAPI;

  public ChatRemoteDataSource(ConnectionUtil connectionUtil, ChatAPI chatAPI) {
    super(connectionUtil);
    this.chatAPI = chatAPI;
  }

  @Override public Maybe<List<ChatDataEntity>> getThreads(int offset) {
    try {
      checkConnection();

      return chatAPI.getThreads(offset)
          .flatMap(BaseResponseObservable::new)
          .map(BaseResponse::getData);
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override
  public MaybeTransformer<List<ChatDataEntity>, List<ChatDataEntity>> saveThreads(int offset) {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<ChatDataEntity> createThread(String recipientId) {
    try {
      checkConnection();

      return chatAPI.createThread(new RecipientsRequest(recipientId))
          .flatMap(BaseResponseObservable::new)
          .map(BaseResponse::getData);
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override public Maybe<List<ChatDataEntity>> searchThreads(String searchQuery) {
    try {
      checkConnection();

      return chatAPI.searchThreads(searchQuery)
          .flatMap(BaseResponseObservable::new)
          .map(BaseResponse::getData);
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override public Maybe<List<ChatDataEntity>> searchSuggestions() {
    try {
      checkConnection();

      return chatAPI.searchSuggestions()
          .flatMap(BaseResponseObservable::new)
          .map(BaseResponse::getData);
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override public Maybe<MessageDataEntity> newMessage(String threadId, String message) {
    try {
      checkConnection();

      return chatAPI.newMessage(new MessageRequest(threadId, message))
          .flatMap(BaseResponseObservable::new)
          .map(BaseResponse::getData);
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override public Maybe<MessageDataEntity> getThreadMessages(String threadId) {
    try {
      checkConnection();

      return chatAPI.getThreadMessagesByTimestamp(threadId)
          .flatMap(BaseResponseObservable::new)
          .map(BaseResponse::getData);
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override
  public Maybe<MessageDataEntity> getOldThreadMessagesByTimestamp(String threadId, long timestamp) {
    try {
      checkConnection();

      return chatAPI.getOldThreadMessagesByTimestamp(threadId, timestamp)
          .flatMap(BaseResponseObservable::new)
          .map(BaseResponse::getData);
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override public Maybe<List<FriendEntity>> getAllFriends(int offset) {
    try {
      checkConnection();

      return chatAPI.getAllFriends(offset)
          .flatMap(BaseResponseObservable::new)
          .map(friendsDataEntityBaseResponse -> friendsDataEntityBaseResponse.getData()
              .getFriendEntityList());
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override
  public MaybeTransformer<List<FriendEntity>, List<FriendEntity>> saveAllFriends(int offset) {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<List<FriendEntity>> searchFriends(String searchQuery, int offset) {
    try {
      checkConnection();

      return chatAPI.searchFriends(searchQuery, offset)
          .flatMap(BaseResponseObservable::new)
          .map(friendsDataEntityBaseResponse -> friendsDataEntityBaseResponse.getData()
              .getFriendEntityList());
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }
}
