package net.yamac.springboot2.example;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "example")
@Data
@Validated
public class ExampleProperties {

    private String message;
}
