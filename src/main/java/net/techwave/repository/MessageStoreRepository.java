package net.techwave.repository;

import net.techwave.model.StockQuote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageStoreRepository extends JpaRepository<StockQuote,Integer>
{
}
