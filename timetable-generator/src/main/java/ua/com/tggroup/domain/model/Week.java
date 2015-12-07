package ua.com.tggroup.domain.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by ihor on 01.12.2015.
 */
@Entity
@Table(name = "Week")
public class Week {
    @Id
    @GeneratedValue
    @Column(name = "week_id")
    private int id;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "timetable_id")
    private Timetable timetable;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Week_Day",joinColumns=@JoinColumn(name = "weekId",referencedColumnName = "week_id") ,inverseJoinColumns = @JoinColumn(name = "dayId",referencedColumnName = "day_id"))
    private List<Day> days;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timetable getTimetable() {
        return timetable;
    }

    public void setTimetable(Timetable timetable) {
        this.timetable = timetable;
    }

    public List<Day> getDays() {
        return days;
    }

    public void setDays(List<Day> days) {
        this.days = days;
    }


}
