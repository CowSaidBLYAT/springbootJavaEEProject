package com.springboot.model

import lombok.NoArgsConstructor

@NoArgsConstructor
data class RegisterRequest(
    val email: String,
    val password: String,
)