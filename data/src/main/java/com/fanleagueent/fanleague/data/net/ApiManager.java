package com.fanleagueent.fanleague.data.net;

import com.fanleagueent.fanleague.data.constants.ApiConfig;
import com.fanleagueent.fanleague.data.net.interceptors.HeaderAuthInterceptor;
import com.google.gson.Gson;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiManager {

  private static final String BASE_URL = ApiConfig.BASE_URL;
  private Retrofit mRetrofit;

  public ApiManager(Gson gson, HeaderAuthInterceptor headerAuthInterceptor) {

    HttpLoggingInterceptor interceptorBody = new HttpLoggingInterceptor();
    interceptorBody.setLevel(HttpLoggingInterceptor.Level.BODY);

    /**
     * Add Auth header interceptor
     */

    OkHttpClient okHttpClient =
        new OkHttpClient.Builder().connectTimeout(ApiConfig.HTTP_TIMEOUT, TimeUnit.MILLISECONDS)
            .writeTimeout(ApiConfig.HTTP_TIMEOUT, TimeUnit.MILLISECONDS)
            .readTimeout(ApiConfig.HTTP_TIMEOUT, TimeUnit.MILLISECONDS)
            .addInterceptor(interceptorBody)
            .addInterceptor(headerAuthInterceptor)
            .build();

    mRetrofit = new Retrofit.Builder().baseUrl(BASE_URL)
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .addConverterFactory(GsonConverterFactory.create(gson))
        .client(okHttpClient)
        .build();
  }

  public Retrofit getRetrofit() {
    return mRetrofit;
  }
}
