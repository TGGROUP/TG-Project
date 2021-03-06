package ua.com.tggroup.domain.model;


import javax.persistence.*;
import java.util.List;

@NamedQueries({
        @NamedQuery(name="Building.getAll",
                query="SELECT b FROM Building b"),
        @NamedQuery(name="Building.removeById",
        query="Delete  FROM Building b WHERE b.id= :id")
})

@Entity

@Table(name = "Building")
public class Building {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy ="building" )
    private List<Room> rooms;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Building)) return false;

        Building building = (Building) o;

        if (id != building.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Building{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rooms=" + ( (rooms != null) ? rooms.size() : 0 ) +
                '}';
    }

}
