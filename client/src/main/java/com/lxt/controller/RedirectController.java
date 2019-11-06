package com.lxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("client")
public class RedirectController {

    @RequestMapping("/redirect/{page}")
    public String redirect(@PathVariable("page") String page) {
        return page;
    }

}
