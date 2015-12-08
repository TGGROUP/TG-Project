package ua.com.tggroup.applayer.rest;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ua.com.tggroup.domain.model.Building;
import ua.com.tggroup.domain.services.BuildingService;

import java.util.logging.Logger;


@RestController
@RequestMapping(value = "resources")
public class BuildingResource {

    private static final Logger LOGGER = Logger.getLogger("BuildingResource");
    private static final int NO_CONTENT = 204;


    @Autowired
    private BuildingService buildingService;

    @RequestMapping(method = RequestMethod.POST,value = "/building")
    public Building createBuilding(@RequestParam String name){
        LOGGER.info("/building :: form request" + name.length());
        Building building = new Building();
        building.setName(name);
       return buildingService.create(building);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/building")
    public HttpEntity<String> deleteBuilding(@RequestParam String id){
        LOGGER.info("/delete building :: form request" + id.length());
         buildingService.remove(Integer.valueOf(id));
        return new HttpEntity(NO_CONTENT);
    }


}
