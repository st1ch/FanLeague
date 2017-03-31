/**
 * Copyright (C) 2015 Fernando Cejas Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fanleagueent.fanleague.presentation.di.components;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import com.fanleagueent.fanleague.data.cache.PreferenceHelper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.schedulers.ObserveOn;
import com.fanleagueent.fanleague.domain.schedulers.SubscribeOn;
import com.fanleagueent.fanleague.presentation.di.modules.ActivityModule;
import com.fanleagueent.fanleague.presentation.di.scopes.PerActivity;
import com.fanleagueent.fanleague.presentation.utils.DateUtils;
import com.fanleagueent.fanleague.presentation.utils.DialogHelper;
import com.fanleagueent.fanleague.presentation.utils.FanUtils;
import com.fanleagueent.fanleague.presentation.utils.ImageLoaderHelper;
import com.google.gson.Gson;
import dagger.Component;
import io.reactivecache2.ReactiveCache;

/**
 * A base component upon which fragment's components may depend.
 * Activity-level components should extend this component.
 *
 * Subtypes of ActivityComponent should be decorated with annotation:
 */
@PerActivity @Component(dependencies = FanComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

  AppCompatActivity activity();

  DialogHelper dialogHelper();

  Context context();

  SubscribeOn subscribeOn();

  ObserveOn observerOn();

  Gson gson();

  PreferenceHelper preferenceHelper();

  ImageLoaderHelper imageLoaderHelper();

  FanUtils fanUtils();

  DateUtils dateUtils();

  SharedPreferences sharedPreferences();

  ReactiveCache reactiveCache();

  MapperFactory mapperFactory();
}
