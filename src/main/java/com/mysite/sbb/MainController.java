package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping("/sbb")
    public String index() {
        return "index";
    }

    @RequestMapping("/sbb2")
    @ResponseBody
    public String index2() {
        return "index";
    }
}
