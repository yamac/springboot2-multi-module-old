package net.yamac.springboot2.example;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ExampleController {

    private final ExampleService exampleService;

    @GetMapping("/")
    public String getIndex() {
        return exampleService.getMessage();
    }
}
