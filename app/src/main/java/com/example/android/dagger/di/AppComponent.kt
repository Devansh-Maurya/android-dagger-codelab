package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.main.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Devansh on 22/6/20
 */

@Singleton
@Component(modules = [StorageModule::class, AppSubcomponents::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun registrationComponent(): RegistrationComponent.Factory

    fun inject(activity: MainActivity)
}