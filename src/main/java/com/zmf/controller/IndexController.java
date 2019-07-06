package com.zmf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: zmf
 * @Date: 2019-07-01 22:52
 * @Description:
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/a")
    public  String getIndex(){
        return "c";
    }
}
