package com.springboot.repository

import com.springboot.model.Product
import com.springboot.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface SportingGoodsRepository : JpaRepository<Product, Long> {
    fun findByUser(user: User): List<Product>
}