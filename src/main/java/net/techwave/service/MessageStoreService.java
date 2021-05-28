package net.techwave.service;

import net.techwave.model.StockQuote;
import net.techwave.repository.MessageStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MessageStoreService
{
    @Autowired
    private MessageStoreRepository repository;

    public void saveMessage(StockQuote stockQuote){
        repository.save(stockQuote);
    }
    public List<StockQuote> getAllStockQuotes(){
        return repository.findAll();
    }
}
