package com.fanleagueent.fanleague.presentation.view;

/**
 * Created by st1ch on 02.12.16.
 */

public interface ConnectionView extends ProgressView {

    void onDataNotAvailable();

    void showErrorDialog(String title, String text);

    boolean isNetworkOnline();

    void showErrorCheckConnectionSnackbar();

}
