package com.test.mnr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.BridgeFrom;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;

/**
 * Created by Naveenraj_m on 08-08-2018.
 */
@Configuration
@IntegrationComponentScan
@EnableIntegration
public class MyIntegrationConfiguration {

    @Bean
    public DirectChannel GWChannel() {
        return new DirectChannel();
    }

    @Bean
    @BridgeFrom("GWChannel")
    public DirectChannel outputChannel() {
        return new DirectChannel();
    }

}