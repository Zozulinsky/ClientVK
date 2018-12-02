package zo.den.clientvk.data.network.vk.api

import io.reactivex.Single
import zo.den.clientvk.data.network.vk.Constants
import zo.den.clientvk.data.network.vk.NameCase
import zo.den.clientvk.data.network.vk.VkException
import zo.den.clientvk.data.network.vk.pojo.VkResponse
import zo.den.clientvk.data.network.vk.pojo.payload.friends.Friend
import zo.den.clientvk.data.network.vk.pojo.payload.friends.FriendPayload
import zo.den.clientvk.data.network.vk.services.FriendsService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FriendsApi @Inject constructor(private val friendsService: FriendsService){
    private fun <T> processResponse (vkResponse: VkResponse<T>) :T{
        val payload = vkResponse.payload
        val error = vkResponse.vkError
        return when {
            error != null -> throw VkException("Error, code = ${error.code}, msg = ${error.msg}")
            payload == null -> throw VkException("Payload is null")
            else -> payload
        }
    }

    fun getFriends(
            accessToken: String,
            userId: Int?,
            order: String,
            listId: Int?,
            count: Int?,
            offset: Int?,
            fields: List<String>,
            nameCase: String = NameCase.NOM
    ): Single<FriendPayload<Friend>> {
        return friendsService.get(accessToken,
                Constants.V, userId, order, listId, count, offset, fields.joinToString(), nameCase)
                .map {
                    processResponse(it)
                }
    }
}