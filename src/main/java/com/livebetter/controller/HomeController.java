package com.livebetter.controller;

import com.livebetter.model.Chinese;
import com.livebetter.model.Human;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by mac on 12/07/2017.
 */
@Controller
public class HomeController {
    @Autowired
    Human chinese;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        chinese.sleep();
        return "home";
    }
}
