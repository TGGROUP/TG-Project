package ua.com.tggroup.ui.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BuildingController {
    private static final String BUILDING_PAGE = "building";

    @RequestMapping(value = "/building",method = RequestMethod.GET)
    public String getBuildingPage(){
        return BUILDING_PAGE;
    }
}
