package com.akshay.login_service.controller

import com.akshay.login_service.model.UserCredentials
import com.akshay.login_service.repos.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class SSEController (
    @Autowired
    private val userRepository: UserRepository
){
    @PostMapping("/signUp")
    fun signUp(@RequestBody user:UserCredentials):String =
        try{
            userRepository.save(user)
            "Success"
        }catch (e:Exception){
            e.localizedMessage
        }

    @PostMapping("/login")
    fun login(@RequestBody user: UserCredentials):Boolean {
        try {
            val users = userRepository.findAll().toList()
            users.forEach {
                if (it.name == user.name && it.password == user.password) return true
            }
             return false
        } catch (e: Exception) {
            return false
        }
    }
}