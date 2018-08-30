package net.yamac.springboot2.example.kotlin

import org.assertj.core.api.Assertions.assertThat
import org.hamcrest.Matchers.allOf
import org.hamcrest.Matchers.containsString
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@RunWith(SpringRunner::class)
@SpringBootTest
@AutoConfigureMockMvc
class ApplicationTest {

    @Autowired
    private val exampleService: ExampleService? = null

    @Autowired
    private val mvc: MockMvc? = null

    @Test
    fun contextLoads() {
        assertThat(exampleService).isNotNull
    }

    @Test
    fun testGetIndexReturnsCorrectValue() {
        mvc!!.perform(get("/"))
                .andExpect(status().isOk)
                .andExpect(content().string(allOf<String>(containsString("Hello World Kotlin"), containsString("Test"))))
    }
}
