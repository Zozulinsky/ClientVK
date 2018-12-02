package zo.den.clientvk.data.network.vk

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import zo.den.clientvk.data.DataQualifier
import zo.den.clientvk.data.network.vk.services.FriendsService

@Module
class VkModule {

    @Provides
    @DataQualifier("vkBaseUrl")
    fun provideVkBaseUrl(): String = "https://api.vk.com/method/"

    @Provides
    fun provideFriendsServcie(@DataQualifier("vkBaseUrl") baseUrl: String, okHttpClient: OkHttpClient): FriendsService {
        return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(baseUrl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(FriendsService::class.java)
    }
}