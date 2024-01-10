package com.bs.SpringJDK21.web.rest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 *
 * @author junxinlai
 */
@RestController
public class TestResource {

    @GetMapping("/test2")
    public String test2(){
        System.out.println("我接到请求了2！");
        return "8080：test2知道了";
    }

    @GetMapping("/testL")
    public String testL(){
        System.out.println("我接到请求了L！");
        return "8080：testL知道了";
    }

    @GetMapping("/testP")
    public String testP(){
        System.out.println("我接到请求了P！");
        return "8080：testP知道了";
    }


}
