package org.acme.repository

import org.acme.entity.MyUser
import org.springframework.data.repository.CrudRepository

interface MyUserRepository : CrudRepository<MyUser, Long> {
    fun findByLogin(login: String): MyUser?
//    fun create(user: MyUser): MyUser
}