package zo.den.clientvk

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.vk.sdk.VKSdk

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        VKSdk.initialize(applicationContext)
    }
}
