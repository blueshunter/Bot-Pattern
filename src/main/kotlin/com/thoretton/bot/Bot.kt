package com.thoretton.bot

import com.thoretton.bot.service.BotService
import com.thoretton.bot.model.UserMessage

interface Bot {
    fun onReceiveUserMessage(response: UserMessage, botService: BotService)
    fun onUserReadMessagesEvent(message: UserMessage)
}