package ua.com.tggroup.applayer.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ua.com.tggroup.domain.model.HelloBean;

/**
 * Created by ihor on 30.11.2015.
 */
@RestController
public class HelloResource {

    @RequestMapping(method = RequestMethod.GET,value = "/json")
    public HelloBean greet(){
        HelloBean helloBean = new HelloBean();
        helloBean.setValue("some value json");
        return helloBean;
    }

}
