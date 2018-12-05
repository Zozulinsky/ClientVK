package zo.den.clientvk.presentation.ui

import dagger.Module
import dagger.android.ContributesAndroidInjector
import zo.den.clientvk.presentation.ui.root.MainActivity
import zo.den.clientvk.presentation.ui.root.MainModule
import zo.den.clientvk.presentation.ui.root.MainScope

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [MainModule::class])
    @MainScope
    abstract fun buildMainActivity(): MainActivity
}