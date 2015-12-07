package ua.com.tggroup.domain.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by ihor on 01.12.2015.
 */
@Entity
@Table(name = "Day")
public class Day {
    @Id
    @GeneratedValue
    @Column(name = "day_id")
    private int id;

    @ManyToMany(mappedBy = "days")
    private List<Week> weeks;
}

