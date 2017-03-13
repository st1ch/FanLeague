package com.fanleagueent.fanleague.domain.schedulers;

import io.reactivex.Scheduler;

/**
 * Created by alexeyverbitskiy on 10/31/16.
 */

public interface SubscribeOn {
    Scheduler getScheduler();
}
