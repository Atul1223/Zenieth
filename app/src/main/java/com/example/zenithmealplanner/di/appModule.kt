package com.example.zenithapplication.di

import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.zenithmealplanner.viewModel.NavigationViewModel
import org.koin.dsl.module

val appModule = module {
    single { NavigationViewModel() }
}

val appModules = listOf(appModule)