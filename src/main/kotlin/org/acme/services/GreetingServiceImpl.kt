package org.acme.services

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GreetingServiceImpl @Autowired constructor(val databaseService: DatabaseService): GreetingService {
    override fun greeting(name: String): String {
        return "Hello $name from GreetingServiceImpl your ID is: ${this.databaseService.findById(1L)}"
    }
}