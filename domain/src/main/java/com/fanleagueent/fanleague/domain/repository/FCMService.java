package com.fanleagueent.fanleague.domain.repository;

import io.reactivex.Flowable;
import io.reactivex.annotations.NonNull;

/**
 * Created by alexeyverbitskiy on 3/7/17.
 */

public interface FCMService {
  Flowable<Boolean> registrationFCM(@NonNull String token);

  Flowable<Boolean> unregisterFCM();
}
