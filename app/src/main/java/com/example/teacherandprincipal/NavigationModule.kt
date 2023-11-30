package com.example.teacherandprincipal

import com.example.commonutils.appLevelNavigation.Navigator
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
object NavigationModule {

    @Singleton
    @Provides
    fun provideProvider(): Navigator.Provider {
        return DefaultNavigator()
    }

}