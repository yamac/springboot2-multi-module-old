package net.yamac.springboot2.example.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CommonTestApplication

fun main(args: Array<String>) {
    runApplication<CommonTestApplication>(*args)
}
