package net.yamac.springboot2.example.kotlin

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.stereotype.Service

@EnableConfigurationProperties(ExampleProperties::class)
@Service
class ExampleService(private val exampleProperties: ExampleProperties) {

    fun getMessage(): String = exampleProperties.message
}
