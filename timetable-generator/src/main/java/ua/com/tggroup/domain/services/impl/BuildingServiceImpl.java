package ua.com.tggroup.domain.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.tggroup.dao.BuildingRepository;
import ua.com.tggroup.domain.model.Building;
import ua.com.tggroup.domain.services.BuildingService;

import java.util.List;

@Service
@Transactional
public class BuildingServiceImpl implements BuildingService {

    @Autowired
    private BuildingRepository buildingRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Building> getAll() {
        return buildingRepository.getAll();
    }

    @Override
    public Building create(Building building) {
        return buildingRepository.create(building);
    }

    @Override
    public Building update(Building building) {
        return buildingRepository.update(building);
    }

    @Override
    public void remove(Building building) {
         buildingRepository.delete(building);
    }
}
