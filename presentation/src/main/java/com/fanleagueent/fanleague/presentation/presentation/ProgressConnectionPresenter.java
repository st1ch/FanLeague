package com.fanleagueent.fanleague.presentation.presentation;


import com.fanleagueent.fanleague.data.exception.ServerException;
import com.fanleagueent.fanleague.data.exception.ServerForbiddenException;
import com.fanleagueent.fanleague.domain.subscribers.BaseProgressSubscriber;
import com.fanleagueent.fanleague.presentation.view.ConnectionView;

import io.rx_cache2.RxCacheException;


/**
 * Created by st1ch on 02.12.16.
 */

public class ProgressConnectionPresenter<V extends ConnectionView>
    extends BaseConnectionPresenter<V>
    implements BaseProgressSubscriber.ProgressSubscriberListener {

  @Override public void onError(Throwable t) {
    try {
      checkViewBound();
      getView().hideProgress();

      if (t instanceof ServerForbiddenException) {
        getView().onDataNotAvailable();
      } else if (t instanceof ServerException) {
        getView().showErrorDialog(((ServerException) t).getTitle(), t.getMessage());
      } else if (t instanceof RxCacheException) {

      } else {
        getView().showErrorDialog("Exception", t.getMessage());
      }
    } catch (BasePresenter.ViewNotBoundException e) {
      e.printStackTrace();
    }
  }

  @Override public void onCompleted() {
    try {
      checkViewBound();
      getView().hideProgress();
    } catch (ViewNotBoundException e) {
      e.printStackTrace();
    }
  }

  @Override public void onStartLoading() {
    try {
      checkViewBound();
      getView().showProgress();
    } catch (ViewNotBoundException e) {
      e.printStackTrace();
    }
  }
}
