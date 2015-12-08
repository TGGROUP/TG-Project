package ua.com.tggroup.dao.impl;

import ua.com.tggroup.dao.BuildingRepository;
import ua.com.tggroup.domain.model.Building;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Igor on 07.12.2015.
 */
public class BuildingRepositoryFictionImpl implements BuildingRepository{


    @Override
    public List<Building> getAll() {

        List<Building> buildings = new ArrayList<Building>();
        for(Map.Entry<Integer, Building> entry : FictionRepository.BUILDINGS.entrySet()){
            buildings.add(entry.getValue());
        }
        return buildings;
    }

    @Override
    public Building create(Building building) {
        FictionRepository.BUILDINGS.put(building.getId(), building);
        return building;
    }

    @Override
    public Building update(Building building) {
        Building res = FictionRepository.BUILDINGS.get(building.getId());
        res.setName(building.getName());
        res.setRooms(building.getRooms());
        return res;
    }

    @Override
    public void delete(int buildingId) {
        FictionRepository.BUILDINGS.remove(buildingId);
    }
}
