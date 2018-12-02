package zo.den.clientvk.data.dao

import io.reactivex.Observable
import zo.den.clientvk.data.dto.FriendDto

interface FriendsDao {
    fun getMyFriends(): Observable<FriendDto>
    fun getFriends(userId: Int?) : Observable<FriendDto>
}