package com.fanleagueent.fanleague.data.observables;

import com.fanleagueent.fanleague.data.entity.BaseResponse;
import com.fanleagueent.fanleague.data.exception.ServerException;
import com.fanleagueent.fanleague.data.exception.ServerForbiddenException;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by st1ch on 08.12.16.
 */

public class BaseResponseObservable<T extends BaseResponse> extends Maybe<T> {

  private T baseResponse;

  public BaseResponseObservable(T baseResponse) {
    this.baseResponse = baseResponse;
  }

  @Override protected void subscribeActual(MaybeObserver<? super T> observer) {
    if (baseResponse != null) {
      if (!baseResponse.isError()) {
        observer.onSuccess(baseResponse);
        observer.onComplete();
      } else {

        Iterator it = baseResponse.getErrorData().entrySet().iterator();
        String errorBody = "";
        if (it.hasNext()) {
          Map.Entry pair = (Map.Entry) it.next();
          errorBody = ((List<String>) pair.getValue()).get(0);
          it.remove();
        }
        observer.onError(new ServerException(baseResponse.getMessage(), errorBody));
      }
    } else {
      observer.onError(new ServerForbiddenException());
    }
  }
}

