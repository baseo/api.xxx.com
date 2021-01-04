package api.xxx.net.restapi.repositries;

import org.springframework.data.jpa.repository.JpaRepository;
import api.xxx.net.restapi.entities.CompletedStock;

public interface CompletedStockRepository extends JpaRepository<CompletedStock, Long>{
    
}
