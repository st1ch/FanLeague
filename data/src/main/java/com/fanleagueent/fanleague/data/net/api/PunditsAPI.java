package com.fanleagueent.fanleague.data.net.api;

import com.fanleagueent.fanleague.data.constants.ApiConfig;
import com.fanleagueent.fanleague.data.entity.BaseResponse;
import com.fanleagueent.fanleague.data.entity.entities.games.CreateBetDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.pundits.PunditPostDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.pundits.PunditPostsDataEntity;
import com.fanleagueent.fanleague.data.net.requests.games.CreateBetRequest;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by st1ch on 08.02.17.
 */

public interface PunditsAPI {

  String POSTS = "/pundits/posts";

  String SLUG = "slug";
  String PATH_SLUG = "/{" + SLUG + "}";

  String CREATE_BET = "/games/personal/create_bet";

  String OFFSET = "offset";
  String DISPLAY = "display";
  String MOBILE = "mobile";

  @GET(ApiConfig.API_VERSION + POSTS) Observable<BaseResponse<PunditPostsDataEntity>> getPosts(
      @Query(OFFSET) int offset, @Query(DISPLAY) String displayMode);

  @GET(ApiConfig.API_VERSION + POSTS + PATH_SLUG)
  Observable<BaseResponse<PunditPostDataEntity>> getSinglePost(@Path(SLUG) String slug);

  @POST(ApiConfig.API_VERSION + CREATE_BET) Observable<BaseResponse<CreateBetDataEntity>> createBet(
      @Body CreateBetRequest createBetRequest);
}
