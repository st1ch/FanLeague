package com.fanleagueent.fanleague.domain.usecases;

import com.fanleagueent.fanleague.domain.schedulers.ObserveOn;
import com.fanleagueent.fanleague.domain.schedulers.SubscribeOn;

import org.reactivestreams.Subscription;

import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.subscribers.DefaultSubscriber;


/**
 * Created by alexeyverbitskiy on 10/31/16.
 */

public abstract class UseCase<T> {
  private SubscribeOn subscribeOn;
  private ObserveOn observeOn;
  private Flowable<T> flowable;
  private CompositeDisposable subscriptions;

  public UseCase(SubscribeOn subscribeOn, ObserveOn observeOn) {
    this.subscribeOn = subscribeOn;
    this.observeOn = observeOn;
    this.subscriptions = new CompositeDisposable();
  }

  public void execute(DefaultSubscriber<T> subscriber) {
    if (flowable == null) {
      flowable = getUseCase().subscribeOn(subscribeOn.getScheduler())
          .observeOn(observeOn.getScheduler())
          .cache()
          .onErrorComplete()
          .doOnComplete();
    }

    subscription = flowable.subscribe(subscriber);
    addSubscription(subscription);
  }

  protected abstract Maybe<T> getUseCase();

  public boolean isWorking() {
    return flowable != null;
  }

  void addSubscription(Subscription subscription) {
    subscriptions.add(subscription);
  }

  public void unsubscribe() {
    //if(!subscription.isUnsubscribed()){
    //    subscription.unsubscribe();
    //}
    //if(!subscriptions.isUnsubscribed()){
    //    subscriptions.unsubscribe();
    //}
    subscriptions.clear();
  }
}
