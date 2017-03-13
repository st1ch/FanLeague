package com.fanleagueent.fanleague.data.net.api;

import com.fanleagueent.fanleague.data.constants.ApiConfig;
import com.fanleagueent.fanleague.data.net.requests.chat.RecipientsRequest;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by alexeyverbitskiy on 11/14/16.
 */

public interface FriendsAPI {
    String FRIENDS = "/friends";
    String GET_ALL_FRIENDS = "/get_list";
    String GET_PENDING_FRIENDS = "/pending_list";
    String GET_FACEBOOK_FRIENDS = "/facebook_friends";
    String GET_FACEBOOK_SUGGESTIONS = "/facebook_suggestions";
    String FRIEND_ID = "user_id";
    String PATH_FRIEND_ID = "/{" + FRIEND_ID + "}";
    String SEARCH = "/player_search";
    String DELETE_FRIEND = "/delete";
    String ADD_FRIEND = "/send_request";
    String DECLINE_FRIEND = "/decline_request";
    String ACCEPT_FRIEND = "/accept_request";
    String CANCEL_FRIEND = "/cancel_request";
    String MESSENGER = "/messenger";
    String CREATE_THREAD = "/create_thread";

    String QUERY = "query";
    String OFFSET = "offset";
    String RECIPIENT_ID = "recipient_id";

    @GET(ApiConfig.API_VERSION + FRIENDS + GET_ALL_FRIENDS)
    Observable<FriendsResponse> getAllFriends(@Query(OFFSET) int offset);

    @GET(ApiConfig.API_VERSION + FRIENDS + GET_PENDING_FRIENDS)
    Observable<FriendsResponse> getPendingFriends(@Query(OFFSET) int offset);

    @GET(ApiConfig.API_VERSION + FRIENDS + GET_FACEBOOK_FRIENDS)
    Observable<FriendsResponse> getFacebookFriends(@Query(OFFSET) int offset);

    @GET(ApiConfig.API_VERSION + FRIENDS + GET_FACEBOOK_SUGGESTIONS)
    Observable<FriendsResponse> getFacebookSuggestions();

    @GET(ApiConfig.API_VERSION + FRIENDS + SEARCH)
    Observable<FriendsResponse> searchFriends(@Query(QUERY) String searchQuery,
        @Query(OFFSET) int offset);

    @DELETE(ApiConfig.API_VERSION + FRIENDS + PATH_FRIEND_ID + DELETE_FRIEND)
    Observable<BaseDataResponse> deleteFriend(@Path(FRIEND_ID) String friendId);

    @FormUrlEncoded
    @POST(ApiConfig.API_VERSION + FRIENDS + ADD_FRIEND)
    Observable<BaseDataResponse> addFriend(@Field(RECIPIENT_ID) String recipientId);

    @FormUrlEncoded
    @POST(ApiConfig.API_VERSION + FRIENDS + ACCEPT_FRIEND)
    Observable<BaseDataResponse> acceptFriend(@Field(RECIPIENT_ID) String recipientId);

    @FormUrlEncoded
    @POST(ApiConfig.API_VERSION + FRIENDS + DECLINE_FRIEND)
    Observable<BaseDataResponse> declineFriend(@Field(RECIPIENT_ID) String recipientId);

    @DELETE(ApiConfig.API_VERSION + FRIENDS + PATH_FRIEND_ID + CANCEL_FRIEND)
    Observable<BaseDataResponse> cancelFriend(@Path(FRIEND_ID) String friendId);

    @POST(ApiConfig.API_VERSION + MESSENGER + CREATE_THREAD)
    Observable<ChatResponse> createThread(@Body RecipientsRequest recipientsRequest);
}
