package ua.com.tggroup.ui.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.com.tggroup.domain.model.Building;
import ua.com.tggroup.domain.services.BuildingService;

import java.util.List;
import java.util.logging.Logger;

@Controller
public class BuildingController {
    private static final String BUILDING_PAGE = "building";
    private static final Logger LOGGER = Logger.getLogger("BuildingController");
    @Autowired
    private BuildingService buildingService;

    @RequestMapping(value = "/building",method = RequestMethod.GET)
    public String getBuildingPage(Model model){
        List<Building> allBuildings = buildingService.getAll();
        for (Building building : allBuildings) {
            LOGGER.info(building.getName());
        }
        model.addAttribute("buildings",allBuildings);
        return BUILDING_PAGE;
    }
}
