package ua.com.tggroup.applayer.rest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;
import ua.com.tggroup.applayer.rest.exception.ApplicationLayerException;
import ua.com.tggroup.domain.model.Building;
import ua.com.tggroup.domain.services.BuildingService;


@RestController
@RequestMapping(value = "resources")
public class BuildingResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(BuildingResource.class);
    private static final int NO_CONTENT = 204;


    @Autowired
    private BuildingService buildingService;

    @RequestMapping(method = RequestMethod.POST, value = "/building")
    public Building createBuilding(@RequestParam String name) {
        LOGGER.info("/building :: form request : ", name);
        Building building = new Building();
        building.setName(name);
        return buildingService.create(building);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/building/{id}")
    public HttpEntity<String> deleteBuilding(@PathVariable String id) {
        LOGGER.info("/delete building :: form request : ", id);
        if (id != null) {
            try {
                Integer buildingId = Integer.valueOf(id);
                buildingService.remove(buildingId);
                return new HttpEntity(NO_CONTENT);
            } catch (NumberFormatException e) {
                throw new ApplicationLayerException("Incorrect id from client ", e);
            }
        }
        throw new ApplicationLayerException("Id drom clinet is null");


    }


}
