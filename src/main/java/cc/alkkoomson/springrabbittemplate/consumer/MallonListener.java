package cc.alkkoomson.springrabbittemplate.consumer;

import cc.alkkoomson.springrabbittemplate.dto.MallonDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MallonListener {

    @RabbitListener(queues = "mallon-queue")
    public void dataListenerA(MallonDTO dto){
        System.out.println("Listener receiving data");
        System.out.println(dto.toString());
    }
}
