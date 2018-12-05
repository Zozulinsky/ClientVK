package zo.den.clientvk

import android.app.Application
import com.vk.sdk.VKAccessToken
import com.vk.sdk.VKAccessTokenTracker
import com.vk.sdk.VKSdk
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class VkApplication : DaggerApplication {

    private val vkAccessTokenTracker: VKAccessTokenTracker = object : VKAccessTokenTracker(){
        override fun onVKAccessTokenChanged(oldToken: VKAccessToken?, newToken: VKAccessToken?) {
            if (newToken == null){

            }
        }
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().application(this).create(this)
    }

    override fun onCreate(){
        super.onCreate()
        vkAccessTokenTracker.startTracking()
        VKSdk.initialize(this)
    }
}