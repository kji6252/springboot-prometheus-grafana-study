package io.github.kji6252.springcacheexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableCaching
@RestController
public class SpringCacheExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCacheExampleApplication.class, args);
    }


    @GetMapping("/")
    @Cacheable("hello")
    public String hello() {
        return "hello";
    }


}
