package zo.den.clientvk.data

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import zo.den.clientvk.data.network.NetworkModule
import javax.inject.Singleton

@Module(includes = [NetworkModule::class, DataBinder::class])
class DataModule {
    @Provides
    @Singleton
    @DataQualifier("credentialsPreferences")
    fun provideCredentialsPreferences(context: Context): SharedPreferences = context.getSharedPreferences("credentials", Context.MODE_PRIVATE)
}