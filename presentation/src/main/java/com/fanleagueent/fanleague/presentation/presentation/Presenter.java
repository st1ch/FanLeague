package com.fanleagueent.fanleague.presentation.presentation;

import com.fanleagueent.fanleague.presentation.view.View;

/**
 * Created by alexeyverbitskiy on 10/31/16.
 */

public interface Presenter<V extends View> {
    void bind(V view);
    void unbind();
    void destroy();
}
