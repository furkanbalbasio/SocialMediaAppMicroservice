package com.bilgeadam.config.rabbitmq;




import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {


    @Value("${rabbitmq.queue-register-elastic}")
    private String elasticRegisterQueue;

    @Bean
    public Queue registerQueueElastic(){
        return new Queue(elasticRegisterQueue);
    }

}
