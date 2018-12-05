package zo.den.clientvk.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import zo.den.clientvk.VkApplication
import zo.den.clientvk.data.DataModule
import zo.den.clientvk.presentation.ui.ActivityBuilder
import javax.inject.Singleton

@Singleton
@Component(
        modules = [DataModule::class,
            RouterModule::class,

            ActivityBuilder::class,
            AppModule::class,
            AndroidSupportInjectionModule::class]
)
interface AppComponent : AndroidInjector<VkApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<VkApplication>(){

        @BindsInstance
        abstract fun application(application: Application): Builder
    }
}