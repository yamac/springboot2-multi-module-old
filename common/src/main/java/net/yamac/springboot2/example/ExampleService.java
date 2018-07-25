package net.yamac.springboot2.example;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@EnableConfigurationProperties(ExampleProperties.class)
@RequiredArgsConstructor
@Service
public class ExampleService {

    private final ExampleProperties exampleProperties;

    public String getMessage() {
        return exampleProperties.getMessage();
    }
}
