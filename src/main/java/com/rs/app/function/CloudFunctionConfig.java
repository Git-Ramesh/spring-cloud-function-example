package com.rs.app.function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @author ramesh
 */
@Configuration
public class CloudFunctionConfig {
    @Bean
    public Function<String, String> sayHello() {
        return name -> name + " " + "!";
    }

    @Bean
    public Consumer<Long> printNNumbers() {
        return num -> Stream.iterate(0, n -> n + 1)
                .limit(num)
                .forEach(System.out::println);
    }

    @Bean
    public Supplier<String> getAuthor() {
        return () -> "Ramesh";
    }
}
