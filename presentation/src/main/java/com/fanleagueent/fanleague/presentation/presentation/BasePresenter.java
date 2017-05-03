package com.fanleagueent.fanleague.presentation.presentation;

import android.support.annotation.Nullable;

import com.fanleagueent.fanleague.presentation.view.View;

public abstract class BasePresenter<V extends View> implements Presenter<V> {

    @Nullable
    private V view;

    @Override
    public void bind(V view) {
        this.view = view;
    }

    @Override
    public void unbind() {
        this.view = null;
    }

    @Override
    public void onDestroy() {
        unbind();
    }

    @Nullable
    public V getView() {
        return view;
    }

    public void checkViewBound() throws ViewNotBoundException {
        if (!isViewBound()) {
            throw new ViewNotBoundException();
        }
    }

    private boolean isViewBound() {
        return view != null;
    }

    protected static class ViewNotBoundException extends Exception {
        public ViewNotBoundException() {
            super("Please call Presenter.bind(MvpView) before requesting data to the Presenter");
        }
    }
}
