package org.acme.services

import org.acme.entity.MyUser

interface DatabaseService {
    fun findById(id: Long): MyUser?
    fun createMyUser(): MyUser
}