package org.cat.eye.otus.finance.init

class MessageUtils {

    companion object {
        fun getMessage(name: String?): String {
            return "Congratulation ${name?.trim() ?: "anonymous"}! You've just started your first Kotlin program!"
        }
    }
}
