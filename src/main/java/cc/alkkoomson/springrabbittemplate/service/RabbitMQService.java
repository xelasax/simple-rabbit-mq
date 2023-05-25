package cc.alkkoomson.springrabbittemplate.service;

import cc.alkkoomson.springrabbittemplate.dto.MallonDTO;

public interface RabbitMQService {

    void sendMallonRequest(MallonDTO mallonData);
}
