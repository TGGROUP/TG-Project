package ua.com.tggroup.ui.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @RequestMapping(method = RequestMethod.GET,value = "/hello")
    public String greeting(Model model){
        model.addAttribute("hello","from controller");
        return "hello";
    }

}
