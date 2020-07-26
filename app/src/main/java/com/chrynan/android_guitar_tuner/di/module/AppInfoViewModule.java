package com.chrynan.android_guitar_tuner.di.module;

import android.content.Context;

import com.chrynan.android_guitar_tuner.di.ActivityScope;
import com.chrynan.android_guitar_tuner.di.ApplicationContext;
import com.chrynan.android_guitar_tuner.presenter.AppInfoPresenter;
import com.chrynan.android_guitar_tuner.ui.view.AppInfoView;

import dagger.Module;
import dagger.Provides;

/**
 * A Dagger {@link Module} used for dependency injection in an {@link AppInfoView} implementation.
 */
@Module
public class AppInfoViewModule {

    private final AppInfoView view;

    public AppInfoViewModule(final AppInfoView view) {
        this.view = view;
    }

    @Provides
    @ActivityScope
    AppInfoPresenter provideAppInfoPresenter(@ApplicationContext Context context) {
        return new AppInfoPresenter(context, view);
    }
}
