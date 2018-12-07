package com.reportapp.app.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

    @RequestMapping("/api/hello")
    public String hi() {
        return "Hello world !";
    }

}
