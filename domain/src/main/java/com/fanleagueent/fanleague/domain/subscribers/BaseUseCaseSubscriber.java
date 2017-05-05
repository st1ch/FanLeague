package com.fanleagueent.fanleague.domain.subscribers;


import io.reactivex.subscribers.DefaultSubscriber;

/**
 * Created by alexeyverbitskiy on 10/31/16.
 */

public class BaseUseCaseSubscriber<T> extends DefaultSubscriber<T> {
    @Override
    public void onComplete() {

    }

    @Override
    public void onError(Throwable e) {
        System.out.println("Exception: " + String.valueOf(e));
    }

    @Override
    public void onNext(T t) {

    }
}
