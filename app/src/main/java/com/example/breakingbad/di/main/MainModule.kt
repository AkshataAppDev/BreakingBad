package com.example.breakingbad.di.main

import com.example.breakingbad.database.BreakingBadApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class MainModule {

    @MainScope
    @Provides
    fun providesApiService(retrofit: Retrofit): BreakingBadApi{
        return retrofit.create(BreakingBadApi::class.java)
    }
}