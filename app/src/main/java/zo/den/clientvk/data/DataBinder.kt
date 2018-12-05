package zo.den.clientvk.data

import dagger.Binds
import dagger.Module
import zo.den.clientvk.data.dao.CredentialsDao
import zo.den.clientvk.data.dao.FriendsDao
import zo.den.clientvk.data.dao.impls.CredentialsDaoImpl
import zo.den.clientvk.data.dao.impls.FriendsDaoImpl

@Module
abstract class DataBinder {
    @Binds
    abstract fun bindFriendsDao(dao: FriendsDaoImpl):FriendsDao
    @Binds
    abstract fun bindCredentialsDao(dao: CredentialsDaoImpl): CredentialsDao
}