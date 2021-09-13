package basic.rueda.domain;

import lombok.Getter;

@Getter
public class Car {

    private Integer id;

    private int capacity;

    private Car() {
    }

    public Car(Integer id, String model, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }
}