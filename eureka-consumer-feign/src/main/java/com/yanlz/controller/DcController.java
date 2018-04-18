package com.yanlz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {

    @Autowired
    DcClient dcClient;

    @GetMapping("/consumer")
    public String dc() {
        int wildddServer =9;
        int array[] ={1,2,3,4,5,6,7,8,9};
        for (int a: array){
            System.out.println(a);
        }
        return dcClient.consumer();
    }

    @GetMapping("/test")
    public  String test(){
        return "hello,springCloud!";
    }

}