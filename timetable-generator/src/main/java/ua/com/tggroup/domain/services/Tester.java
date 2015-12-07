package ua.com.tggroup.domain.services;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.com.tggroup.domain.model.Building;
import ua.com.tggroup.domain.model.Room;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ihor on 01.12.2015.
 */
public class Tester {
    public static void main(String [] args){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("connection.xml");
        BuildingService buildingService = classPathXmlApplicationContext.getBean(BuildingService.class);

        Building building = new Building();
        building.setName("first");
        Room room = new Room();
        room.setName("1234");

        building.setRooms(new ArrayList<Room>(Arrays.asList(room)));
        buildingService.create(building);


    }

}
