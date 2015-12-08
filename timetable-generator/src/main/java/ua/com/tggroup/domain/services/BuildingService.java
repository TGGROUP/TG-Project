package ua.com.tggroup.domain.services;

import ua.com.tggroup.domain.model.Building;

import java.util.List;


public interface BuildingService {
    public List<Building> getAll();
    public Building create(Building building);
    public Building update(Building building);
    public void remove(int buildingId);

}
