package com.example;

import javax.annotation.Nullable;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/test")
public class TestController {

    @Get("/mytest{/var}")
    public String index(@Nullable String var) {
        return var;
    }
}