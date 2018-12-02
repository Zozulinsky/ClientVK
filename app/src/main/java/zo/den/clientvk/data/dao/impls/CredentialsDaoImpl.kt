package zo.den.clientvk.data.dao.impls
import android.content.SharedPreferences
import io.reactivex.Completable
import io.reactivex.Single
import zo.den.clientvk.data.DataQualifier
import zo.den.clientvk.data.TokenNotExistsException
import zo.den.clientvk.data.dao.CredentialsDao
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CredentialsDaoImpl @Inject constructor() : CredentialsDao {

    companion object {
        private const val ACCESS_TOKEN = "ACCESS_TOKEN"
        private const val USER_ID = "USER_ID"
    }

    @Inject
    @field:DataQualifier("credentialsPreferences")
    lateinit var sharedPreferences: SharedPreferences

    override fun saveToken(vkToken: CredentialsDao.VkToken): Completable {
        return Completable.fromAction{
            sharedPreferences.edit()
                    .putString(USER_ID, vkToken.userId)
                    .putString(ACCESS_TOKEN, vkToken.token)
                    .apply()
        }
    }

    override fun getToken(): Single<CredentialsDao.VkToken> = Single.fromCallable {
        val userId: String? = sharedPreferences.getString(USER_ID, null)
        val token: String? = sharedPreferences.getString(ACCESS_TOKEN, null)
        if (userId == null || token == null){
            throw TokenNotExistsException()
        }else CredentialsDao.VkToken(userId, token)
    }

    override fun isTokenExists(): Single<Boolean> {
        return getToken().map { true }.onErrorReturnItem(false)
    }


    override fun clearToken(): Completable {
        return Completable.fromAction{
            sharedPreferences.edit().clear().apply()
        }
    }

}