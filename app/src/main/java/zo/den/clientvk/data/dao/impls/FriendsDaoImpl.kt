package zo.den.clientvk.data.dao.impls

import io.reactivex.Observable
import zo.den.clientvk.data.dto.FriendDto
import zo.den.clientvk.data.dao.CredentialsDao
import zo.den.clientvk.data.dao.FriendsDao
import zo.den.clientvk.data.mapper.FriendDtoMapper
import zo.den.clientvk.data.network.vk.Fields
import zo.den.clientvk.data.network.vk.FriendOrder
import zo.den.clientvk.data.network.vk.api.FriendsApi
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FriendsDaoImpl @Inject constructor() : FriendsDao {
    @Inject
    lateinit var friendsApi: FriendsApi
    @Inject
    lateinit var credentialsDao: CredentialsDao

    override fun getMyFriends(): Observable<FriendDto> {
        return getFriends(null)
    }

    override fun getFriends(userId: Int?): Observable<FriendDto> {
        return credentialsDao.getToken().flatMap {
            friendsApi.getFriends(
                    it.token,
                    userId,
                    FriendOrder.HINTS,
                    null,
                    null,
                    null,
                    listOf(Fields.PHOTO_50)
            )
        }.flatMapObservable {
            Observable.fromIterable(it.items)
        }.map(FriendDtoMapper())
    }
}