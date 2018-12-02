package zo.den.clientvk.data.network

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import zo.den.clientvk.data.network.vk.VkModule
import javax.inject.Singleton

@Module(includes = [VkModule::class])
class NetworkModule {

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient = OkHttpClient.Builder().build()

}