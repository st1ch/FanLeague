package com.fanleagueent.fanleague.data.net.interceptors;

import com.fanleagueent.fanleague.data.cache.PreferenceHelper;
import java.io.IOException;
import javax.inject.Inject;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class HeaderAuthInterceptor implements Interceptor {

    private PreferenceHelper preferenceHelper;

    @Inject
    public HeaderAuthInterceptor(PreferenceHelper preferenceHelper) {
        this.preferenceHelper = preferenceHelper;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        request = request.newBuilder()
                .addHeader("Authorization", "Bearer " + preferenceHelper.getAccessToken())
                .build();
        return chain.proceed(request);
    }
}
