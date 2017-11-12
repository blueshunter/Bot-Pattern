package com.thoretton.bot.model

sealed class UserMessage(
        val userId: String
) {
    class TextUserMessage(
            userId: String,
            val text: String
    ): UserMessage(userId)

    class CoordinateUserMessage(
            userId: String,
            val lat: Long,
            val long: Long
    ): UserMessage(userId)

    class ButtonUserMessage(
            userId: String,
            val buttonValue: String
    ): UserMessage(userId)
}