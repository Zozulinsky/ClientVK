package zo.den.clientvk.data.network.vk

open class VkException  : Exception {
    constructor() : super()
    constructor(message: String?) : super(message)
    constructor(message: String?, cause: Throwable?) : super(message, cause)
    constructor(cause: Throwable?) : super(cause)
}

class VkCaptchaException(val captch: String) : VkException()