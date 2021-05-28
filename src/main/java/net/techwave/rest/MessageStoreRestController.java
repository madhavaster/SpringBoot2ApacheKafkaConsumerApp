package net.techwave.rest;

import net.techwave.model.StockQuote;
import net.techwave.service.MessageStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ms")
public class MessageStoreRestController
{
    @Autowired
    private MessageStoreService service;

    @GetMapping("/all")
    public ResponseEntity<List<StockQuote>> showData(){
        List<StockQuote> allStockQuotes = service.getAllStockQuotes();
        return ResponseEntity.ok(allStockQuotes);
    }
}
