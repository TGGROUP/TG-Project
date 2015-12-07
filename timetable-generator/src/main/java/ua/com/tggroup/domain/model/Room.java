package ua.com.tggroup.domain.model;

import javax.persistence.*;

@Entity
@Table(name = "Room")
public class Room {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private int capacity;

    private boolean hasProjector;

    private boolean hasBoard;

    private boolean isComputerClass;


    @ManyToOne()
    @JoinColumn(name = "building_id")
    private Building building;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isHasProjector() {
        return hasProjector;
    }

    public void setHasProjector(boolean hasProjector) {
        this.hasProjector = hasProjector;
    }

    public boolean isHasBoard() {
        return hasBoard;
    }

    public void setHasBoard(boolean hasBoard) {
        this.hasBoard = hasBoard;
    }

    public boolean isComputerClass() {
        return isComputerClass;
    }

    public void setComputerClass(boolean isComputerClass) {
        this.isComputerClass = isComputerClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if (id != room.id) return false;
        if (building != null ? !building.equals(room.building) : room.building != null) return false;
        if (name != null ? !name.equals(room.name) : room.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (building != null ? building.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", building=" + building +
                '}';
    }
}
