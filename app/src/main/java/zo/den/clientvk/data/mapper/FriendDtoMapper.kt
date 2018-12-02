package zo.den.clientvk.data.mapper

import io.reactivex.functions.Function
import zo.den.clientvk.data.dto.FriendDto
import zo.den.clientvk.data.network.vk.pojo.payload.friends.Friend
import zo.den.clientvk.data.throwIfNull

class FriendDtoMapper : Function<Friend, FriendDto> {
    override fun apply(t: Friend): FriendDto {
        return FriendDto(
                t.id.throwIfNull(),
                t.lastName.throwIfNull(),
                t.firstName.throwIfNull(),
                t.photo50.throwIfNull()
        )
    }

}