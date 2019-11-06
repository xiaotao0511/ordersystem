package com.lxt.controller;

import com.lxt.entity.Menu;
import com.lxt.entity.MenuVO;
import com.lxt.feign.MenuFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private MenuFeign menuFeign;

    @RequestMapping("/findAll")
    public MenuVO findAll(@RequestParam("page") int page, @RequestParam("limit") int limit) {
        int index = (page-1) * limit;
        return new MenuVO(0,"",10,menuFeign.findAll(index,limit));
    }
}
