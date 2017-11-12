package com.consul.pp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/pp")
public class ProfileEndpoint {

    @RequestMapping(value="/health")
    public @ResponseBody String health() {
        return "success";
    }

}
