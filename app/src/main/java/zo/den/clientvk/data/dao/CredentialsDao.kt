package zo.den.clientvk.data.dao

import io.reactivex.Completable
import io.reactivex.Single

interface CredentialsDao {

    data class VkToken(val userId: String, val token: String)

    fun saveToken(vkToken: VkToken): Completable
    fun getToken():Single<VkToken>
    fun isTokenExists(): Single<Boolean>
    fun clearToken(): Completable
}