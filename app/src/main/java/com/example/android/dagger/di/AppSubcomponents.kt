package com.example.android.dagger.di

import com.example.android.dagger.login.LoginComponent
import com.example.android.dagger.registration.RegistrationComponent
import dagger.Module

/**
 * Created by Devansh on 23/6/20
 */

@Module(subcomponents = [RegistrationComponent::class, LoginComponent::class])
class AppSubcomponents