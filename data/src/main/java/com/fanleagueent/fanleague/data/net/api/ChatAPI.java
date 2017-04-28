package com.fanleagueent.fanleague.data.net.api;

import com.fanleagueent.fanleague.data.constants.ApiConfig;
import com.fanleagueent.fanleague.data.entity.BaseResponse;
import com.fanleagueent.fanleague.data.entity.entities.chat.ChatDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.chat.MessageDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.friends.FriendsDataEntity;
import com.fanleagueent.fanleague.data.net.requests.chat.MessageRequest;
import com.fanleagueent.fanleague.data.net.requests.chat.RecipientsRequest;
import io.reactivex.Maybe;
import java.util.List;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by alexeyverbitskiy on 02/1/17.
 */

public interface ChatAPI {
    String MESSENGER = "/messenger";
    String THREADS = "/threads";
    String CREATE_THREAD = "/create_thread";
    String NEW_MESSAGE = "/new_message";
    String THREAD_MESSAGES = "/thread_messages";
    String OLD_THREAD_MESSAGES = "/old_thread_messages";
    String SEARCH = "/search";
    String THREAD = "/thread";
    String READ = "/read";
    String MARK = "/mark";
    String SYSTEM = "/system";
    String CREATE = "/create";
    String THREAD_ID = "thread_id";
    String SYSTEM_MESSAGE_ID = "system_message_id";
    String PATH_SYSTEM_MESSAGE_ID = "/{" + SYSTEM_MESSAGE_ID + "}";

    String QUERY = "query";
    String OFFSET = "offset";
    String TIMESTAMP = "timestamp";

    String SEARCH_SUGGESTIONS = "/search_suggestions";
    String FRIENDS = "/friends";
    String SEARCH_PLAYER = "/player_search";
    String GET_ALL_FRIENDS = "/get_list";

    @GET(ApiConfig.API_VERSION + MESSENGER + THREADS) Maybe<BaseResponse<List<ChatDataEntity>>> getThreads(@Query(OFFSET) int offset);

    @POST(ApiConfig.API_VERSION + MESSENGER + CREATE_THREAD)
    Maybe<BaseResponse<ChatDataEntity>> createThread(@Body RecipientsRequest recipientsRequest);

    @GET(ApiConfig.API_VERSION + MESSENGER + SEARCH)
    Maybe<BaseResponse<List<ChatDataEntity>>> searchThreads(@Query(QUERY) String searchQuery);

    @GET(ApiConfig.API_VERSION + MESSENGER + SEARCH_SUGGESTIONS)
    Maybe<BaseResponse<List<ChatDataEntity>>> searchSuggestions();

    @POST(ApiConfig.API_VERSION + MESSENGER + NEW_MESSAGE)
    Maybe<BaseResponse<MessageDataEntity>> newMessage(@Body MessageRequest messageRequest);

    @GET(ApiConfig.API_VERSION + MESSENGER + THREAD_MESSAGES)
    Maybe<BaseResponse<MessageDataEntity>> getThreadMessagesByTimestamp(@Query(THREAD_ID) String threadId);

    @GET(ApiConfig.API_VERSION + MESSENGER + OLD_THREAD_MESSAGES)
    Maybe<BaseResponse<MessageDataEntity>> getOldThreadMessagesByTimestamp(@Query(THREAD_ID) String threadId, @Query(TIMESTAMP) long timestamp);

    @GET(ApiConfig.API_VERSION + MESSENGER + THREAD)
    Maybe<BaseResponse<ChatDataEntity>> getThread(@Query(THREAD_ID) String threadId);

    @GET(ApiConfig.API_VERSION + FRIENDS + GET_ALL_FRIENDS)
    Maybe<BaseResponse<FriendsDataEntity>> getAllFriends(@Query(OFFSET) int offset);

    @GET(ApiConfig.API_VERSION + FRIENDS + SEARCH_PLAYER)
    Maybe<BaseResponse<FriendsDataEntity>> searchFriends(@Query(QUERY) String searchQuery, @Query(OFFSET) int offset);
}
