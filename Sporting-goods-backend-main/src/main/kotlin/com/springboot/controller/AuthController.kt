package com.springboot.controller

import com.springboot.model.AuthRequest
import com.springboot.model.AuthResponse
import com.springboot.model.RegisterRequest
import com.springboot.service.AuthenticationService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin("*")
@RequestMapping("/api/auth")
class AuthController(private val service: AuthenticationService) {

    @PostMapping("/register")
    fun register(@RequestBody request: RegisterRequest): ResponseEntity<String> =
        ResponseEntity.ok(service.register(request))

    @PostMapping("/authenticate")
    fun authenticate(@RequestBody request: AuthRequest): ResponseEntity<String> =
        ResponseEntity.ok(service.authenticate(request))
}