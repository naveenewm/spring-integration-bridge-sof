package com.test.mnr;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.Message;

import java.util.List;

/**
 * Created by Naveenraj_m on 09-08-2018.
 */

@MessagingGateway(name = "gatewayChannel", defaultRequestChannel = "GWChannel")
public interface OrderGateway {

    @Gateway
    public void send(Message<List<Integer>> messages);
}
