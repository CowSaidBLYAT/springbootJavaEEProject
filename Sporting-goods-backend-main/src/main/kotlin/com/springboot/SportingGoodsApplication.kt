package com.springboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["com.springboot", "com.springboot.controller", "com.springboot.service"])
class SportingGoodsApplication

fun main(args: Array<String>) { runApplication<SportingGoodsApplication>(*args) }