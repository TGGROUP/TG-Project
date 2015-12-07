package ua.com.tggroup.domain.services.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.tggroup.domain.model.Timetable;
import ua.com.tggroup.domain.services.TimetableService;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by ihor on 01.12.2015.
 */
@Service
public class TimetableImpl implements TimetableService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Override
    public Timetable createTimetable(Timetable timetable) {
        entityManager.persist(timetable);
        return timetable;
    }
}
