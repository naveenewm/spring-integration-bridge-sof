package com.test.mnr;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

/**
 * Created by Naveenraj_m on 09-08-2018.
 */

@MessageEndpoint
public class MessageActivatorImpl {

    @ServiceActivator(inputChannel = "outputChannel")
    public void receiveMessage(Message<Integer> message) {

        System.out.println("message = " + message.getPayload());

    }
}
