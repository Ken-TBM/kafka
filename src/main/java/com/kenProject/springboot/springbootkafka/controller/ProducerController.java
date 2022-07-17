package com.kenProject.springboot.springbootkafka.controller;

import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

//    @Autowired
//    KafkaTemplate<String,String> kafka;

    @RequestMapping("/kenProject")
    public String data(@RequestParam("msg") String msg){
        //通过kafka发送出去
//        kafka.send("fist",msg);
        return msg+"ok";
    }
}
