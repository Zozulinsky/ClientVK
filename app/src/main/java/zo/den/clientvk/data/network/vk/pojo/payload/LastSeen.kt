package zo.den.clientvk.data.network.vk.pojo.payload

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class LastSeen {

    @SerializedName("time")
    @Expose
    var time: Int? = null
    @SerializedName("platform")
    @Expose
    var platform: Int? = null

}
