package net.techwave.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.techwave.model.StockQuote;

public interface JsonUtil
{
    static StockQuote toStock(String message){
        try
        {
            return new ObjectMapper().readValue(message, StockQuote.class);
        } catch (JsonProcessingException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
