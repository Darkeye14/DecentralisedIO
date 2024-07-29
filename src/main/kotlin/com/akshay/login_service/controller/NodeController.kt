package com.akshay.login_service.controller

import com.akshay.login_service.model.MachineNode
import com.akshay.login_service.repos.NodeRepo
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class NodeController(
    private val nodeRepo: NodeRepo
) {
    @PostMapping("/saveNode")
    fun saveNode(@RequestBody node: MachineNode):ResponseEntity<Boolean>{
        try {
            nodeRepo.save(node)
            return ResponseEntity(true,HttpStatus.CREATED)
        }catch (e:Exception){return ResponseEntity(false,HttpStatus.BAD_REQUEST)}
    }

    @GetMapping("/getPendingNodes")
    fun getNodes() = nodeRepo.findAll().toList()

}