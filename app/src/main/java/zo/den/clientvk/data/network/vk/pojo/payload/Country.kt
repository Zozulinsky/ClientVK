package zo.den.clientvk.data.network.vk.pojo.payload

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Country {

    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("title")
    @Expose
    var title: String? = null

}
