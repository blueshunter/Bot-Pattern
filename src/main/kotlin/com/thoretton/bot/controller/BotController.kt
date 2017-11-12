package com.bot.controller

import com.thoretton.bot.service.BotService
import com.thoretton.bot.Bot

abstract class BotController(val bot: Bot, val botService: BotService)