package com.fanleagueent.fanleague.presentation.view.authorization;


import com.fanleagueent.fanleague.presentation.view.ConnectionView;

/**
 * Created by st1ch on 02.11.2016.
 */

public interface AuthorizationView extends ConnectionView {
    void onSuccess();

    void hideKeyboard();
}
