package com.thoretton.bot.model

open class IllegalUserMessageException(
        messageException: String,
        val userMessage: UserMessage
) : IllegalArgumentException(
        messageException
)

class IllegalButtonUserMessageException(
        messageException: String,
        userMessage: UserMessage.ButtonUserMessage

) : IllegalUserMessageException(
        messageException,
        userMessage
)

class IllegalTextUserMessageException(
        messageException: String,
        userMessage: UserMessage.TextUserMessage
) : IllegalUserMessageException(
        messageException,
        userMessage
)

class IllegalCoordinateUserMessageException(
        messageException: String,
        userMessage: UserMessage.CoordinateUserMessage
) : IllegalUserMessageException(
        messageException,
        userMessage
)