package com.akshay.login_service.repos

import com.akshay.login_service.model.UserCredentials
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository:MongoRepository<UserCredentials,String>