package zo.den.clientvk.data.network.vk.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Error {

    @SerializedName("error_code")
    @Expose
    var errorCode: Int? = null
    @SerializedName("error_msg")
    @Expose
    var errorMsg: String? = null

}
