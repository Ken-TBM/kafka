package com.kenProject.springboot.springbootkafka.controller;

import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
public class ConsumerConsumer {
    @KafkaListener(topics =  "first")
    public void consumerTopic(String msg){
        System.out.println("收到消息："+msg);

    }
}
