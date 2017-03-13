package com.fanleagueent.fanleague.data.net.api;

import com.fanleagueent.fanleague.data.constants.ApiConfig;
import com.fanleagueent.fanleague.data.entity.BaseResponse;
import com.fanleagueent.fanleague.data.net.requests.fcm.FCMRegisterRequest;
import java.util.List;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.POST;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by alexeyverbitskiy on 3/7/17.
 */

public interface FCMRegistrationAPI {

  String SETTINGS = "/settings";
  String REGISTER_DEVICE = "/register_device";
  String UNREGISTER_DEVICE = "/unregister_device";

  String DEVICE = "device";
  String PATH_DEVICE = "/{" + DEVICE + "}";


  @POST(ApiConfig.API_VERSION + SETTINGS + REGISTER_DEVICE) Observable<BaseResponse<List<Void>>> registerDevice(
      @Body FCMRegisterRequest fcmRegisterRequest);

  @DELETE(ApiConfig.API_VERSION + SETTINGS + PATH_DEVICE + UNREGISTER_DEVICE) Observable<BaseResponse<List<Void>>> unregisterDevice(
      @Path(DEVICE) String deviceId);
}
