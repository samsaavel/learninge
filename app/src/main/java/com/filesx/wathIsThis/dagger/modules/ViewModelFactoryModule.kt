package com.filesx.wathIsThis.dagger.modules

import androidx.lifecycle.ViewModelProvider
import com.filesx.wathIsThis.dagger.viewmodel.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {

    @Binds
    internal abstract fun bindViewModelFactoryModule(factory: ViewModelFactory): ViewModelProvider.Factory
}