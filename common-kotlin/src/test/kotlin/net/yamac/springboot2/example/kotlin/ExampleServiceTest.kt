package net.yamac.springboot2.example.kotlin

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class ExampleServiceTest {

    @Autowired
    private val exampleService: ExampleService? = null

    @Test
    fun testGetMessageReturnsCorrectValue() {
        assertThat(exampleService!!.getMessage()).isNotNull()
        assertThat(exampleService.getMessage()).contains("Hello World Kotlin").contains("Test")
    }
}
