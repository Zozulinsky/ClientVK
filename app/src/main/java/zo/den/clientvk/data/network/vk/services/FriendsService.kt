package zo.den.clientvk.data.network.vk.services

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query
import zo.den.clientvk.data.network.vk.pojo.VkResponse
import zo.den.clientvk.data.network.vk.pojo.payload.friends.Friend
import zo.den.clientvk.data.network.vk.pojo.payload.friends.FriendPayload

interface FriendsService {
    @GET("friends.get")
    fun get(
            @Query("access_token") accessToken: String,
            @Query("v") v: String,
            @Query("user_id") userId: Int?,
            @Query("order") order: String,
            @Query("list_id") listId: Int?,
            @Query("count") count: Int?,
            @Query("offset") offset: Int?,
            @Query("fields") fields: String,
            @Query("name_case") nameCase: String?
    ): Single<VkResponse<FriendPayload<Friend>>>
}