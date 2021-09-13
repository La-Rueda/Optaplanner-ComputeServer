package basic.rueda.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.DayOfWeek;
import java.time.LocalTime;

@Getter
@Setter
public class Person {

    private String name;

//    private Double newFactorDrivesByTotalDays;

    private Person() {
    }

    public Person(String name, Double factor, Car car) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
