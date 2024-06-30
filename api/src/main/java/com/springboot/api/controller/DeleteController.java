package com.springboot.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vi/delete-api")
public class DeleteController {

    @DeleteMapping(value = "/{변수}")
    public String DeleteVariable(@PathVariable String 변수) {
        return 변수;
    }

    @DeleteMapping(value = "/request1")
    public String getRequestParam1(@RequestParam String email) {
        return "email : " + email;
    }
}
