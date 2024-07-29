package com.akshay.login_service.model

import org.bson.types.ObjectId
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "users")
data class UserCredentials (
    val _id:ObjectId = ObjectId(),
    val name:String,
    val password:String
)