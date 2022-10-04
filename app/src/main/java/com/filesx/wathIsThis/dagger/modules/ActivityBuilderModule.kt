package com.filesx.wathIsThis.dagger.modules

import com.filesx.wathIsThis.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(
        modules = [
            FragmentBuilderModule::class,
            ViewModelFactoryModule::class
        ]
    )

    abstract fun contributeMainActivity(): MainActivity
}