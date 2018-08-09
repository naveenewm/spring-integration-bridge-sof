package com.test.mnr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.support.MessageBuilder;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Naveenraj_m on 08-08-2018.
 */

@SpringBootApplication
@ComponentScan
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);

        OrderGateway gateway = context.getBean(OrderGateway.class);

        gateway.send(
                MessageBuilder.withPayload(
                        IntStream.range(1, 1000)
                            .mapToObj(i -> i)
                                .collect(Collectors.toList())).build());
    }

}
