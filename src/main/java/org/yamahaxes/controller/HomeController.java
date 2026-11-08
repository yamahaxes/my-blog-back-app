package org.yamahaxes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping(value = "/hello")
    @ResponseBody
    public String homePage() {
        return "<h1>Hello, World!</h1>";
    }

}
