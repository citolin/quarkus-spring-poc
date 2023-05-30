package org.acme.services

import org.acme.entity.MyUser
import org.acme.repository.MyUserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DatabaseServiceImpl @Autowired constructor(private val myUserRepository: MyUserRepository): DatabaseService {
    override fun findById(id: Long): MyUser? {
        println(id)
        return this.myUserRepository.findById(id).orElse(null)
    }

    override fun createMyUser(): MyUser {
        return this.myUserRepository.save(MyUser("", "Lucas", ""))
    }
}