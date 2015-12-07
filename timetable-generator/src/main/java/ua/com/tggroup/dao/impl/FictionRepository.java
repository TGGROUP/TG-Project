package ua.com.tggroup.dao.impl;

import ua.com.tggroup.domain.model.Building;
import ua.com.tggroup.domain.model.Room;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Created by Igor on 07.12.2015.
 */
public class FictionRepository {

    static final HashMap<Integer, Building> BUILDINGS = new HashMap<Integer,Building>();
    static{
        fillBuildings();
    }

    private static final Random RANDOM = new Random();

    private static void fillBuildings(){
        Building building1 = createBuilding(1, "Building#1", null);
        Building building2 = createBuilding(2, "Building#2", null);

        BUILDINGS.put(1, building1);
        BUILDINGS.put(2, building2);


        final int ROOMS_CAP = 10;
        for(int i = 1; i < ROOMS_CAP; ++i){
            addRoom(building1, createRoom(i,"1-10"+i, building1));
            addRoom(building1, createRoom(i+ROOMS_CAP,"1-20"+i, building1));
            addRoom(building2, createRoom(i+ROOMS_CAP*2,"2-20"+i, building2));
            addRoom(building2, createRoom(i+ROOMS_CAP*3,"2-30"+i, building2));
        }
    }

    private static Building createBuilding(int id, String name, List<Room> rooms){
        Building building = new Building();
        building.setId(id);
        building.setName(name);
        // prevent from NPE
        building.setRooms(rooms == null ? new ArrayList<Room>() : rooms);
        return building;
    }

    private static void addRoom(Building building, Room room){
        // could throw NPE
        building.getRooms().add(room);
    }

    private static Room createRoom(int id, String name, Building building){
        Room room = new Room();
        room.setId(id);
        room.setName(name);
        room.setBuilding(building);
        room.setCapacity(RANDOM.nextInt(31)+10);
        room.setHasBoard(true);
        room.setComputerClass(RANDOM.nextBoolean());
        room.setHasProjector(RANDOM.nextBoolean());
        return room;
    }
}
