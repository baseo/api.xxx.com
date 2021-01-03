package api.xxx.net.restapi.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import api.xxx.net.restapi.entities.Greeting;

@RestController
@RequestMapping("/greeting")
public class Sample_Greeting_RestAPIService {

    private static final String template = "Hello, %s!";

    @GetMapping
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(1234L, String.format(template, name));
	}
    
}
