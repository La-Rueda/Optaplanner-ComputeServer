package basic.rueda.domain;

import lombok.Getter;
import lombok.Setter;
import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningScore;
import org.optaplanner.core.api.domain.solution.PlanningSolution;
import org.optaplanner.core.api.domain.solution.ProblemFactCollectionProperty;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;

import java.util.List;

import static java.util.stream.Collectors.groupingBy;

@PlanningSolution
@Getter
@Setter
public class CarPersonAllocation {

    @ValueRangeProvider(id = "personRange")
    @ProblemFactCollectionProperty
    private List<Person> personList;

     @ValueRangeProvider(id = "carRange")
     @ProblemFactCollectionProperty
     private List<Car> carList;

    @PlanningEntityCollectionProperty
    private List<SharedTrip> sharedTripList;

    @PlanningScore
    private HardSoftScore score;

    private CarPersonAllocation() {
    }

    public CarPersonAllocation(List<Person> personList, List<Car> carList,
                               List<SharedTrip> sharedTripList) {
        this.personList = personList;
        // this.carList = carList;
        this.sharedTripList = sharedTripList;
    }

//    @Override
//    public String toString() {
//        Map<String, List<SharedTrip>> result = sharedTripList.stream().collect(groupingBy(SharedTrip::carUsedInDay));
//        StringBuilder sb = new StringBuilder();
//        for (Map.Entry<String, List<SharedTrip>> entry : result.entrySet()) {
//            SharedTrip title = entry.getValue().get(0);
//            sb.append("Day of week: ");
//            sb.append(title.getDayOfWeek());
//            sb.append(" Car: ");
//            sb.append(title.getCar());
//            sb.append(" Passengers: ");
//            sb.append(entry.getValue().stream().map(i -> i.getDriver().getName()).collect(Collectors.joining(", ")));
//            sb.append("\n");
//        }
//        return sb.toString();
//    }
}