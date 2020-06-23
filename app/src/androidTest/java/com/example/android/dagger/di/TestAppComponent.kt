package com.example.android.dagger.di

import dagger.Component
import javax.inject.Singleton

/**
 * Created by Devansh on 23/6/20
 */

@Singleton
@Component(modules = [TestStorageModule::class, AppSubcomponents::class])
interface TestAppComponent : AppComponent