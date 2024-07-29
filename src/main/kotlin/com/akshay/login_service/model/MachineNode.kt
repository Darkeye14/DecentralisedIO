package com.akshay.login_service.model

import org.bson.types.ObjectId
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "pending-nodes")
data class MachineNode (
    val id:ObjectId = ObjectId(),
    val deviceName:String,
    val deviceId:String,
    val cpu:String,
    val gpu:String?,
    val ram:String,
    val systemOs:String
)