package ua.com.tggroup.domain.model.services;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.com.tggroup.domain.model.Timetable;

/**
 * Created by ihor on 01.12.2015.
 */
public class Tester {
    public static void main(String [] args){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("connection.xml");
        TimetableService bean = classPathXmlApplicationContext.getBean(TimetableService.class);
        Timetable timetable = new Timetable();
        Timetable timetableCreated = bean.createTimetable(timetable);
        System.out.println("timetableCreated = " + timetableCreated);
    }

}
