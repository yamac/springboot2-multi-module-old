package net.yamac.springboot2.example.kotlin

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.validation.annotation.Validated

@ConfigurationProperties("example")
@Validated
class ExampleProperties {

    lateinit var message: String
}
