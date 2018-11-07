package com.thehecklers.kotlinkafkasource

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.cloud.stream.messaging.Source

@EnableBinding(Source::class)
@SpringBootApplication
class KotlinKafkaSourceApplication

fun main(args: Array<String>) {
    runApplication<KotlinKafkaSourceApplication>(*args)
}
