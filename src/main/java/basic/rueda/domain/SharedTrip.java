package basic.rueda.domain;

import lombok.Getter;
import lombok.Setter;
import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

@PlanningEntity
@Getter
@Setter
public class SharedTrip {

    // Value to be assigned in optimization.
    @PlanningVariable(valueRangeProviderRefs = "personRange")
    public Person driver;

     @PlanningVariable(valueRangeProviderRefs = "carRange")
    public Car car;

    private List<Person> passengers;
    // ¿Por qué es necesario darle valor a sharedTripList?

    private SharedTrip() {
    }

    private SharedTrip(Person driver, Car car) {
        this.driver = driver;
        this.car = car;
    }

    @Override
    public String toString() {
        return "{ \n Driver: " + driver + "\n Car: " + car + " }";
    }


}