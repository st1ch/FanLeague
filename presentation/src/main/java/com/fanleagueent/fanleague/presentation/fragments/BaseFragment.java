package com.fanleagueent.fanleague.presentation.fragments;

import android.support.v4.app.Fragment;

import com.fanleagueent.fanleague.presentation.di.components.HasComponent;

/**
 * Created by alexeyverbitskiy on 4/27/17.
 */

public class BaseFragment extends Fragment {

    @SuppressWarnings("unchecked")
    protected <C> C getComponent(Class<C> componentType) {
        return componentType.cast(((HasComponent<C>) getActivity()).getComponent());
    }
}
