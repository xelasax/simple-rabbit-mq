package cc.alkkoomson.springrabbittemplate.config;


import cc.alkkoomson.springrabbittemplate.dto.MallonDTO;
import cc.alkkoomson.springrabbittemplate.service.RabbitMQService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

// This componenet just puts data into rabbit MQ for test
@Component
public class InitRabbit implements CommandLineRunner {

    private final RabbitMQService rabbitMQService;

    public InitRabbit(RabbitMQService rabbitMQService) {
        this.rabbitMQService = rabbitMQService;
    }


    @Override
    public void run(String... args) throws Exception {
        testData().forEach(data -> {
            rabbitMQService.sendMallonRequest(data);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public List<MallonDTO> testData(){
        var data1 = new MallonDTO("test","testing","female");
        var data2 = new MallonDTO("test2","testing","female");
        var data3 = new MallonDTO("test3","testing","female");
        var data4 = new MallonDTO("test4","testing","female");
        var data5 = new MallonDTO("test5","testing","female");
        var data6 = new MallonDTO("test6","testing","female");

        return List.of(data1,data2,data3,data4,data5,data6,data1);
    }
}
