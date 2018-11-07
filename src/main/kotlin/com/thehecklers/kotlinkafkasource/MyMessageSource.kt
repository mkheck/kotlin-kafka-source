package com.thehecklers.kotlinkafkasource

import org.springframework.cloud.stream.messaging.Source
import org.springframework.messaging.support.MessageBuilder
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MyMessageSource(private val source: Source) {

    @GetMapping("/hello")
    private fun helloMessage() = "Hello!"

    @PostMapping("/send")
    private fun sendMessage() {
        println("Sending message")
        source.output().send(MessageBuilder.withPayload(Person("Iron Man")).build())
    }
}