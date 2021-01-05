package api.xxx.net.restapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import api.xxx.net.restapi.entities.CompletedStock;
import api.xxx.net.restapi.repositries.CompletedStockRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/data/completedstock")
public class CRUD_CompletedStock_RestAPIService {

    private final CompletedStockRepository completedStockRepository;
    /**
     * Reading completed stock list with no limit...
     * @return List<CompletedStock> by JSON
     */
    @GetMapping
    public List<CompletedStock> retrieveCompletedStocks() {
        List<CompletedStock> resultList = new ArrayList<CompletedStock>();
        completedStockRepository.findAll().forEach(stock -> resultList.add(stock));
        return resultList;
    }
    /**
     * Creating completed stock list without conflict. NOT COMPLETED! SECURITY Impl FIRST!
     * @param completedStockList
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void  createCompletedStocks(@RequestBody List<CompletedStock> completedStockList) {
        completedStockRepository.saveAll(completedStockList);
    }
}
