package zo.den.clientvk.presentation.mapper

import io.reactivex.functions.Function
import zo.den.clientvk.data.dto.FriendDto
import zo.den.clientvk.presentation.model.FriendModel

class FriendModelMapper: Function<FriendDto, FriendModel> {
    override fun apply(t: FriendDto): FriendModel {
        return FriendModel(t.id, "${t.lastName}&{t.firstName}", t.photoUrl)
    }
    }
