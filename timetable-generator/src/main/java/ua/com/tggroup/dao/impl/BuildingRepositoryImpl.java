package ua.com.tggroup.dao.impl;

import org.springframework.stereotype.Repository;
import ua.com.tggroup.dao.BuildingRepository;
import ua.com.tggroup.domain.model.Building;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class BuildingRepositoryImpl implements BuildingRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @SuppressWarnings("unchecked")
    public List<Building> getAll() {
        return entityManager.createNamedQuery("Building.getAll").getResultList();
    }

    @Override
    public Building create(Building building) {
        entityManager.persist(building);
        return building;
    }

    @Override
    public Building update(Building building) {
        entityManager.merge(building);
        return building;
    }

    @Override
    public void delete(int buildingId) {
        entityManager.remove(entityManager.find(Building.class,buildingId));
    }
}
