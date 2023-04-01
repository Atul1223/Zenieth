package com.example.zenithapplication.di

import com.example.zenithmealplanner.viewModel.NavigationViewModel
import org.koin.dsl.module

var appModule = module {
    single { NavigationViewModel() }
}