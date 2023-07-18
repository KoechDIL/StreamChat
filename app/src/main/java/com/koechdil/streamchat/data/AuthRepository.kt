package com.koechdil.streamchat.data

import com.google.firebase.auth.AuthResult
import com.koechdil.streamchat.util.Resource
import kotlinx.coroutines.flow.Flow

interface AuthRepository {
    fun loginUser(email: String, password: String): Flow<Resource<AuthResult>>
    fun registerUser(email: String, password: String): Flow<Resource<AuthResult>>
}