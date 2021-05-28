package net.techwave.consumer;

import net.techwave.model.StockQuote;
import net.techwave.service.MessageStoreService;
import net.techwave.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ConsumerService
{
    @Autowired
    private MessageStoreService service;

    @KafkaListener(topics = "${my.app.topic.name}",groupId = "groupA")
    public void consumeMessage(String message){
        StockQuote stockQuote = JsonUtil.toStock(message);
        stockQuote.setServiceDate(new Date());
        service.saveMessage(stockQuote);
    }
}