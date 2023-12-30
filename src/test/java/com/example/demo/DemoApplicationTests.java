package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThatNoException;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {

    @Test
    @DisplayName("should not throw any errors")
    void shouldNotThrowAnyErrors() {
        assertThatNoException().isThrownBy(() -> DemoApplication.main(new String[]{"--server.port=0"}));
    }
}
