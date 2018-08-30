package net.yamac.springboot2.example.kotlin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ExampleController(val exampleService: ExampleService) {

    @GetMapping("/")
    fun getIndex(): String = exampleService.getMessage()
}
