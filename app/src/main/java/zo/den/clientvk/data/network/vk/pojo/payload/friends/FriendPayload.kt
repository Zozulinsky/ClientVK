package zo.den.clientvk.data.network.vk.pojo.payload.friends

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class FriendPayload<T> {

    @SerializedName("count")
    @Expose
    var count: Int? = null
    @SerializedName("items")
    @Expose
    var items: List<T>? = null

}
