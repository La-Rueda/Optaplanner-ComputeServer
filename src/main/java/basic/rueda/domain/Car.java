package basic.rueda.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Car {

    public Integer id;

    public Integer capacity;

    private int personList;
    private Car() {
    }

    public Car(Integer id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", capacity=" + capacity +
                ", personList=" + personList +
                '}';
    }
}