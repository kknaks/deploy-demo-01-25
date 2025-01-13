package com.ll.demo03.domain.home.home.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @Value("${custom.site.name}")
    private String siteName;
    @Value("${custom.secret.key}")
    private String secretKey;

    @GetMapping("/")
    @ResponseBody
    public String showMain() {
        return "Hello, World deploㅁㅇㄴㄹㅁㅇㄹㅁy ssdajhflk;jsdaㄹㅇㅁ닐ㅇㄴ뫄ㅓㅣㅁ이ㅏㅓㅗㅁㅇㄹ나ㅣㅗㅓㅁㅇㄹ나ㅣㅗㅓㅁㅇㄹ나ㅣㅗㅓj;nlflk;jadsf;jlfa;lads;lfhsdal;hjlkfjklasdfuccess!!!!!, on " + siteName;
    }

    @GetMapping("/secretKey")
    @ResponseBody
    public String showSecretKey() {
        return "secretKey : " + secretKey;
    }
}
