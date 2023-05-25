package cc.alkkoomson.springrabbittemplate.service.impl;


import cc.alkkoomson.springrabbittemplate.config.RabbitMQConfig;
import cc.alkkoomson.springrabbittemplate.dto.MallonDTO;
import cc.alkkoomson.springrabbittemplate.service.RabbitMQService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQServiceImpl implements RabbitMQService {

    private final RabbitTemplate rabbitTemplate;

    // Constructor based injection
    public RabbitMQServiceImpl(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void sendMallonRequest(MallonDTO mallonData) {
        rabbitTemplate.convertAndSend(RabbitMQConfig.exchangeName,RabbitMQConfig.routingKey,mallonData);
    }
}
