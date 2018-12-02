package zo.den.clientvk.data.network.vk.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

import java.lang.Error

class VkError {

    @SerializedName("error_code")
    @Expose
    var code: Int = 0

    @SerializedName("error_msg")
    @Expose
    var msg: String = ""

}
