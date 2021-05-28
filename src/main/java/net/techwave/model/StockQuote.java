package net.techwave.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class StockQuote
{
    @Id
    @GeneratedValue(generator = "stock_quote_gen")
    @SequenceGenerator(name = "stock_quote_gen",sequenceName = "stock_quote_seq")
    private Integer id;
    private String stockCode;
    private Double sharePrice;
    @Temporal(TemporalType.TIMESTAMP)
    private Date serviceDate;
}