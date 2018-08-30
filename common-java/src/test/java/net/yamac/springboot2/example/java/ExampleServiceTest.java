package net.yamac.springboot2.example.java;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExampleServiceTest {

    @Autowired
    private ExampleService exampleService;

    @Test
    public void testGetMessageReturnsCorrectValue() {
        assertThat(exampleService.getMessage()).isNotNull();
        assertThat(exampleService.getMessage()).contains("Hello World Java").contains("Test");
    }
}
