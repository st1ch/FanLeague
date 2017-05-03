package com.fanleagueent.fanleague.presentation.presentation;

import com.fanleagueent.fanleague.presentation.view.ConnectionView;

/**
 * Created by st1ch on 02.12.16.
 */

public abstract class BaseConnectionPresenter<V extends ConnectionView> extends BasePresenter<V> {

    public void checkConnection() throws ConnectionException {
        if(!getView().isNetworkOnline()){
            getView().showErrorCheckConnectionSnackbar();
                throw new ConnectionException();
        }
    }

    protected static class ConnectionException extends Exception {
        public ConnectionException() {
            super("Please check Internet connection before requesting data");
        }
    }
}
