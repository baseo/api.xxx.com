package api.xxx.net.restapi.services;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.xxx.net.restapi.entities.CompletedStock;
import api.xxx.net.restapi.repositories.CompletedStockRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/data/completedstock")
public class CRUD_CompletedStock_RestAPIService {

    private final CompletedStockRepository completedStockRepository;

    /**
     * Creating completed stock list without conflict. 
     * @param completedStockList
     */
    @PostMapping
    public void  createCompletedStocks(@RequestBody Iterable<CompletedStock> completedStockList) {
        completedStockRepository.saveAll(completedStockList);
    }

    /**
     * Reading completed stock list with no limit...
     * @return
     */
    @GetMapping
    public Iterable<CompletedStock> retrieveCompletedStocks() {
        return completedStockRepository.findAll();
    }

    /**
     * Updating completed stock list by foreign key. Posting method is also same.
     * @param completedStockList
     */
    @PutMapping
    public void updateCompletedStock(@RequestBody Iterable<CompletedStock> completedStockList) {
        completedStockRepository.saveAll(completedStockList);
    }

    /**
     * Physical Deleting completed stock by Id
     * @param id
     */
    @DeleteMapping("{id}")
    public void deleteCompletedStocks(@PathVariable("id") Long id) {
        completedStockRepository.deleteById(id);
    }

    
}
