package com.thoretton.bot.service

import com.thoretton.bot.model.MessageResponse
import com.thoretton.bot.model.User
import io.reactivex.Observable

interface BotService {

    fun getUser(id: String): Observable<User>

    fun sendMessage(message: String, userId: String, delay: Long = 0): Observable<MessageResponse>

    fun sendTyping(userId: String, delay: Long = 0, stopTyping: Boolean = false): Observable<MessageResponse>

    fun sendMarkSeen(userId: String, delay: Long = 0): Observable<MessageResponse>

    fun sendMarkSeenAndTyping(userId: String, delay: Long = 0): Observable<MessageResponse>
}