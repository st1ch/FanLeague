package com.fanleagueent.fanleague.data.net.api;

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

    String FRIENDS = "/friends";
    String SEARCH_PLAYER = "/player_search";
    String GET_ALL_FRIENDS = "/get_list";

    //@GET(ApiConfig.API_VERSION + MESSENGER + THREADS)
    //Observable<BaseResponse<List<ChatDataEntity>>> getThreads(@Query(OFFSET) int offset);
    //
    //@POST(ApiConfig.API_VERSION + MESSENGER + CREATE_THREAD)
    //Observable<BaseResponse<ChatDataEntity>> createThread(@Body RecipientsRequest recipientsRequest);
    //
    //@GET(ApiConfig.API_VERSION + MESSENGER + SEARCH)
    //Observable<BaseResponse<List<ChatDataEntity>>> searchThreads(@Query(QUERY) String searchQuery);
    //
    //@POST(ApiConfig.API_VERSION + MESSENGER + NEW_MESSAGE)
    //Observable<BaseResponse<MessageDataEntity>> newMessage(@Body MessageRequest messageRequest);
    //
    //@GET(ApiConfig.API_VERSION + MESSENGER + THREAD_MESSAGES)
    //Observable<BaseResponse<MessageDataEntity>> getThreadMessagesByTimestemp(@Query(THREAD_ID) String threadId,
    //    @Query(TIMESTAMP) int timestamp);
    //
    //@GET(ApiConfig.API_VERSION + MESSENGER + OLD_THREAD_MESSAGES)
    //Observable<Void> getOldThreadMessagesByTimestemp(@Query(THREAD_ID) String threadId,
    //    @Query(TIMESTAMP) int timestamp);
    //
    //@GET(ApiConfig.API_VERSION + MESSENGER + THREAD)
    //Observable<BaseResponse<ChatDataEntity>> getThread(@Query(THREAD_ID) String threadId);
    //
    //@GET(ApiConfig.API_VERSION + MESSENGER + SYSTEM)
    //Observable<Void> getSystemMessagesThreads();
    //
    //@PATCH(ApiConfig.API_VERSION + MESSENGER + SYSTEM + PATH_SYSTEM_MESSAGE_ID + READ)
    //Observable<Void> readMessage(@Path(SYSTEM_MESSAGE_ID) String systemMessageId);
    //
    //@PATCH(ApiConfig.API_VERSION + MESSENGER + SYSTEM + PATH_SYSTEM_MESSAGE_ID + MARK)
    //Observable<Void> markMessage(@Path(SYSTEM_MESSAGE_ID) String systemMessageId);
    //
    //@FormUrlEncoded
    //@POST(ApiConfig.API_VERSION + MESSENGER + SYSTEM + CREATE)
    //Observable<Void> createSystemMessage();
    //
    //@GET(ApiConfig.API_VERSION + FRIENDS + GET_ALL_FRIENDS)
    //Observable<BaseResponse<FriendsDataEntity>> getAllFriends(@Query(OFFSET) int offset);
    //
    //@GET(ApiConfig.API_VERSION + FRIENDS + SEARCH_PLAYER)
    //Observable<BaseResponse<FriendsDataEntity>> searchFriends(@Query(QUERY) String searchQuery,
    //    @Query(OFFSET) int offset);
}
