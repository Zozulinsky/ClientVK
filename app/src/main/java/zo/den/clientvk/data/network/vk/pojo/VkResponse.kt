package zo.den.clientvk.data.network.vk.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class VkResponse<T> {

    @SerializedName("response")
    @Expose
    var payload: T? = null

    @SerializedName("error")
    @Expose
    var vkError: VkError? = null
}
