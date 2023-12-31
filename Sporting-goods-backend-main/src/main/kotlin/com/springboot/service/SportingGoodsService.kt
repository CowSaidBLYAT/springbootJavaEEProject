package com.springboot.service

import com.springboot.dto.ProductDTO
import com.springboot.model.User

interface SportingGoodsService {
    fun getAllGoods(email: String): List<ProductDTO>
    fun addGood(good: ProductDTO, email: String): Boolean
    fun getGoodById(id: Long): ProductDTO
    fun updateGood(id: Long, count: Int, email: String): Boolean
    fun deleteGood(id: Long, email: String): Boolean
}