package com.akshay.login_service.repos

import com.akshay.login_service.model.MachineNode
import org.springframework.data.mongodb.repository.MongoRepository

interface NodeRepo : MongoRepository<MachineNode,String>