package org.acme

import org.acme.entity.MyUser
import org.acme.services.DatabaseService
import org.acme.services.GreetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/spring/greeting")
class SpringGreetingResource @Autowired constructor(private val greetingService: GreetingService, private val databaseService: DatabaseService) {
    @GetMapping
    fun hello(): HashMap<String, String> {
        return hashMapOf("title" to "hello")
    }

    @GetMapping("/by-id")
    fun findById(): HashMap<String, String> {
        return hashMapOf("title" to this.greetingService.greeting("Lucas") )
    }

    @PostMapping("/my-user")
    fun createMyUser(): MyUser {
        return this.databaseService.createMyUser()
    }

    @GetMapping("/my-user/{id}")
    fun findMyUserById(@PathVariable(name = "id") myUserId: Long): MyUser? {
        val a =  this.databaseService.findById(myUserId)
        println(a)
        return a
    }
}