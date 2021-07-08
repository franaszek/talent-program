package springcoretraining.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyEndpoint {

    @Value("${sth.new}")
    private String sth;

    @GetMapping("/config")
    public String getValue() {
        return sth;
    }
}
