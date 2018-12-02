package zo.den.clientvk.data
import kotlin.NoSuchElementException

fun <T> T?.throwIfNull(): T {
    return this ?: throw NoSuchElementException()
}