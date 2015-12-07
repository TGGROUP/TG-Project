package ua.com.tggroup.dao;


import ua.com.tggroup.domain.model.Building;

import java.util.List;

public interface BuildingRepository {
    public List<Building> getAll();
    public Building create(Building building);
    public Building update(Building building);
    public void delete(Building building);
}
