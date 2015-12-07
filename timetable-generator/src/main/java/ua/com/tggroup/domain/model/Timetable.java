package ua.com.tggroup.domain.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by ihor on 01.12.2015.
 */

@Entity
@Table(name = "Timetable")
public class Timetable {

    @Id
    @GeneratedValue
    private int id;

    @OneToMany(mappedBy = "timetable")
    private List<Week> weeks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Week> getWeeks() {
        return weeks;
    }

    public void setWeeks(List<Week> weeks) {
        this.weeks = weeks;
    }

    @Override
    public String toString() {
        return "Timetable{" +
                "id=" + id +
                ", weeks=" + weeks +
                '}';
    }
}
