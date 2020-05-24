package com.malinda.oktaresourceserver.api.v1.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/tests")
public class TestController {

    @GetMapping("/api")
    public String api() {
        return "Made it to protected api on resource server!";
    }

}
