package zo.den.clientvk.data.network.vk.pojo.payload.friends

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

import zo.den.clientvk.data.network.vk.pojo.payload.City
import zo.den.clientvk.data.network.vk.pojo.payload.Country
import zo.den.clientvk.data.network.vk.pojo.payload.LastSeen
import zo.den.clientvk.data.network.vk.pojo.payload.University

class Friend {

    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("first_name")
    @Expose
    var firstName: String? = null
    @SerializedName("last_name")
    @Expose
    var lastName: String? = null
    @SerializedName("is_closed")
    @Expose
    var isClosed: Boolean? = null
    @SerializedName("can_access_closed")
    @Expose
    var canAccessClosed: Boolean? = null
    @SerializedName("sex")
    @Expose
    var sex: Int? = null
    @SerializedName("nickname")
    @Expose
    var nickname: String? = null
    @SerializedName("domain")
    @Expose
    var domain: String? = null
    @SerializedName("bdate")
    @Expose
    var bdate: String? = null
    @SerializedName("city")
    @Expose
    var city: City? = null
    @SerializedName("country")
    @Expose
    var country: Country? = null
    @SerializedName("photo_50")
    @Expose
    var photo50: String? = null
    @SerializedName("photo_100")
    @Expose
    var photo100: String? = null
    @SerializedName("photo_200_orig")
    @Expose
    var photo200Orig: String? = null
    @SerializedName("has_mobile")
    @Expose
    var hasMobile: Int? = null
    @SerializedName("online")
    @Expose
    var online: Int? = null
    @SerializedName("can_post")
    @Expose
    var canPost: Int? = null
    @SerializedName("can_see_all_posts")
    @Expose
    var canSeeAllPosts: Int? = null
    @SerializedName("can_write_private_message")
    @Expose
    var canWritePrivateMessage: Int? = null
    @SerializedName("home_phone")
    @Expose
    var homePhone: String? = null
    @SerializedName("status")
    @Expose
    var status: String? = null
    @SerializedName("last_seen")
    @Expose
    var lastSeen: LastSeen? = null
    @SerializedName("university")
    @Expose
    var university: Int? = null
    @SerializedName("university_name")
    @Expose
    var universityName: String? = null
    @SerializedName("faculty")
    @Expose
    var faculty: Int? = null
    @SerializedName("faculty_name")
    @Expose
    var facultyName: String? = null
    @SerializedName("graduation")
    @Expose
    var graduation: Int? = null
    @SerializedName("education_form")
    @Expose
    var educationForm: String? = null
    @SerializedName("education_status")
    @Expose
    var educationStatus: String? = null
    @SerializedName("relation")
    @Expose
    var relation: Int? = null
    @SerializedName("universities")
    @Expose
    var universities: List<University>? = null

}
