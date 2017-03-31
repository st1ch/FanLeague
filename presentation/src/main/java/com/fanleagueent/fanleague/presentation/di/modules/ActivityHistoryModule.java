package com.fanleagueent.fanleague.presentation.di.modules;

import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.data.net.ApiManager;
import com.fanleagueent.fanleague.data.net.api.ActivityHistoryAPI;
import com.fanleagueent.fanleague.data.repository.activity_history.ActivityHistoryRepositoryImpl;
import com.fanleagueent.fanleague.data.repository.activity_history.datasource.ActivityHistoryDataSource;
import com.fanleagueent.fanleague.data.repository.activity_history.datasource.ActivityHistoryLocalDataSource;
import com.fanleagueent.fanleague.data.repository.activity_history.datasource.ActivityHistoryRemoteDataSource;
import com.fanleagueent.fanleague.domain.repository.ActivityHistoryRepository;
import com.fanleagueent.fanleague.presentation.di.qualifiers.Local;
import com.fanleagueent.fanleague.presentation.di.qualifiers.Remote;
import com.fanleagueent.fanleague.presentation.di.scopes.ActivityHistoryScope;
import dagger.Module;
import dagger.Provides;
import io.reactivecache2.ReactiveCache;

/**
 * Created by alexeyverbitskiy on 3/2/17.
 */
@Module public class ActivityHistoryModule {

  @Provides @ActivityHistoryScope ActivityHistoryAPI provideActivityHistoryAPI(
      ApiManager apiManager) {
    return apiManager.getRetrofit().create(ActivityHistoryAPI.class);
  }

  @Provides @ActivityHistoryScope @Remote
  ActivityHistoryDataSource provideActivityHistoryRemoteDataSource(ActivityHistoryAPI api,
      ReactiveCache reactiveCache) {
    return new ActivityHistoryRemoteDataSource(api, reactiveCache);
  }

  @Provides @ActivityHistoryScope @Local
  ActivityHistoryDataSource provideActivityHistoryLocalDataSource(ReactiveCache reactiveCache) {
    return new ActivityHistoryLocalDataSource(reactiveCache);
  }

  @Provides @ActivityHistoryScope
  ActivityHistoryRepository provideActivityHistoryRepository(
      @Remote ActivityHistoryDataSource remoteDataSource,
      @Local ActivityHistoryDataSource localDataSource, MapperFactory mapperFactory) {
    return new ActivityHistoryRepositoryImpl(remoteDataSource, localDataSource, mapperFactory);
  }

  //@Provides AllActivityHistoryPresenter provideAllActivityHistoryPresenter(LoadActivityHistoryAllUseCase loadActivityHistoryAllUseCase){
  //  return new AllActivityHistoryPresenterImpl(loadActivityHistoryAllUseCase);
  //}
  //
  //@Provides BetsActivityHistoryPresenter provideBetsActivityHistoryPresenter(LoadActivityHistoryBetsUseCase loadActivityHistoryBetsUseCase){
  //  return new BetsActivityHistoryPresenterImpl(loadActivityHistoryBetsUseCase);
  //}
  //
  //@Provides FriendsActivityHistoryPresenter provideFriendsActivityHistoryPresenter(LoadActivityHistoryFriendsUseCase loadActivityHistoryFriendsUseCase){
  //  return new FriendsActivityHistoryPresenterImpl(loadActivityHistoryFriendsUseCase);
  //}
  //
  //@Provides LeaguesActivityHistoryPresenter provideLeaguesActivityHistoryPresenter(LoadActivityHistoryLeaguesUseCase loadActivityHistoryLeaguesUseCase){
  //  return new LeaguesActivityHistoryPresenterImpl(loadActivityHistoryLeaguesUseCase);
  //}
  //
  //@Provides TeamsActivityHistoryPresenter provideTeamsActivityHistoryPresenter(LoadActivityHistoryTeamsUseCase loadActivityHistoryTeamsUseCase){
  //  return new TeamsActivityHistoryPresenterImpl(loadActivityHistoryTeamsUseCase);
  //}
}
