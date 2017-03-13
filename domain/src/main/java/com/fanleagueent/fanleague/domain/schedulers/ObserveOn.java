package com.fanleagueent.fanleague.domain.schedulers;

import io.reactivex.Scheduler;

public interface ObserveOn {
    Scheduler getScheduler();
}
