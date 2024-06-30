package com.hoon512.rabbitmqtest;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class Receiver {


  @RabbitListener(queues = {"queue-name"}, concurrency = "3")
  public void receiveMessage(Message message) throws InterruptedException {
    log.info("Received message: {}", message.msg());
    Thread.sleep(5000);
  }

}
