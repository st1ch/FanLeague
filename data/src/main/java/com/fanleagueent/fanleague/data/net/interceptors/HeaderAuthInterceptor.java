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
                //.addHeader("Authorization", "Bearer " + preferenceHelper.getAccessToken())
                .addHeader("Authorization", "Bearer " + "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwOi8vZGV2YXBpLmZhbmxlYWd1ZS5jb20vdjEvYXV0aC9sb2dpbi9mYWNlYm9vayIsImlhdCI6MTQ5MDM0MzIwMSwiZXhwIjoxNDk2MzQzMjAxLCJuYmYiOjE0OTAzNDMyMDEsImp0aSI6InU3VXh2dmYzVHcyUUFsbG8iLCJzdWIiOiI1ODZkZmZmMWJjOTQwNDdhYTQyYWIzOTAifQ.VqsHrsmBA1Koa8NfLalczi1SFlK-AuXXrM_dPAziiNE")
                .build();
        return chain.proceed(request);
    }
}
