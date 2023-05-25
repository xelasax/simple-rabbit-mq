package cc.alkkoomson.springrabbittemplate.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    // NB: The properties marked as static final should be externalized
    public static final String exchangeName = "mallon-exchange";
    public static final String queueName = "mallon-queue";
    public static final String routingKey = "mallon";
    @Bean
    TopicExchange exchange() {
        return new TopicExchange(exchangeName, true, false);
    }

    @Bean
    Queue mallonQueue() {
        return new Queue(queueName, true);
    }

    @Bean
    Binding mallonBinding(Queue mallonQueue, TopicExchange exchange) {
        return BindingBuilder.bind(mallonQueue).to(exchange).with(routingKey);
    }
}
