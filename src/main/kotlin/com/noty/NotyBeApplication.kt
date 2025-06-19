package com.noty

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NotyBeApplication

fun main(args: Array<String>) {
	runApplication<NotyBeApplication>(*args)
}
