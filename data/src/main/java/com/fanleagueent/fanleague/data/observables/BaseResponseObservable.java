package com.fanleagueent.fanleague.data.observables;

import com.fanleagueent.fanleague.data.entity.BaseResponse;
import com.fanleagueent.fanleague.data.exception.ServerException;
import com.fanleagueent.fanleague.data.exception.ServerForbiddenException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rx.Observable;

/**
 * Created by st1ch on 08.12.16.
 */

public class BaseResponseObservable<T extends BaseResponse> extends Observable<T> {

  public BaseResponseObservable(T baseResponse) {
    super(subscriber -> {
      if (baseResponse != null) {
        if (!baseResponse.isError()) {
          subscriber.onNext(baseResponse);
          subscriber.onCompleted();
        } else {

          Iterator it = baseResponse.getErrorData().entrySet().iterator();
          String errorBody = "";
          if (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            errorBody = ((List<String>) pair.getValue()).get(0);
            it.remove();
          }
          subscriber.onError(new ServerException(baseResponse.getMessage(), errorBody));
        }
      } else {
        subscriber.onError(new ServerForbiddenException());
      }
    });
  }
}
