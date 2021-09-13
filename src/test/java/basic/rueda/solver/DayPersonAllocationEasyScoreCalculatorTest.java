package basic.rueda.solver;

import basic.rueda.rest.TimeTableController;
import org.springframework.beans.factory.annotation.Autowired;


public class DayPersonAllocationEasyScoreCalculatorTest {

    @Autowired
    private TimeTableController timeTableController;

    // @Test
    // @Timeout(600_000)
    public void solve() {
//        DayPersonAllocation problem = generateProblem();
//        DayPersonAllocation solution = timeTableController.solve(problem);
//        assertFalse(solution.getSharedTripList().isEmpty());
//        for (SharedTrip sharedTrip : solution.getSharedTripList()) {
//            assertNotNull(sharedTrip.getCar());
//        }
//        System.err.println(solution);
//        assertTrue(solution.getScore().isFeasible());
    }

//    private DayPersonAllocation generateProblem() {

//        Person tom = new Person("Tom");
//        Person mary = new Person("Mary");
//        Person annie = new Person("Annie");
//        Person sammy = new Person("Sammy");
//        Person peter = new Person("Peter");
//
//        List<Person> personList = new ArrayList<>();
//        personList.add(tom);
//        personList.add(mary);
//        personList.add(annie);
//        personList.add(sammy);
//        personList.add(peter);
//
//        List<Car> carList = new ArrayList<>();
//        carList.add(new Car(1, tom, "Vokswagen", 4));
//        carList.add(new Car(2, mary, "Vokswagen", 4));
//        carList.add(new Car(3, sammy, "Vokswagen", 4));
//        carList.add(new Car(4, annie, "Vokswagen", 4));
//        carList.add(new Car(5, peter, "Vokswagen", 4));
//
//        List<SharedTrip> sharedTripList = new ArrayList<>();
//        sharedTripList.add(new SharedTrip(DayOfWeek.MONDAY, tom));
//        sharedTripList.add(new SharedTrip(DayOfWeek.MONDAY, mary));
//        sharedTripList.add(new SharedTrip(DayOfWeek.MONDAY, annie));
//        sharedTripList.add(new SharedTrip(DayOfWeek.MONDAY, sammy));
//        sharedTripList.add(new SharedTrip(DayOfWeek.MONDAY, peter));
//        sharedTripList.add(new SharedTrip(DayOfWeek.TUESDAY, tom));
//        sharedTripList.add(new SharedTrip(DayOfWeek.TUESDAY, mary));
//        sharedTripList.add(new SharedTrip(DayOfWeek.TUESDAY, annie));
//        sharedTripList.add(new SharedTrip(DayOfWeek.TUESDAY, peter));
//        sharedTripList.add(new SharedTrip(DayOfWeek.TUESDAY, sammy));
//        sharedTripList.add(new SharedTrip(DayOfWeek.WEDNESDAY, tom));
//        sharedTripList.add(new SharedTrip(DayOfWeek.WEDNESDAY, mary));
//        sharedTripList.add(new SharedTrip(DayOfWeek.WEDNESDAY, annie));
//        sharedTripList.add(new SharedTrip(DayOfWeek.WEDNESDAY, sammy));
//        sharedTripList.add(new SharedTrip(DayOfWeek.WEDNESDAY, peter));
//        sharedTripList.add(new SharedTrip(DayOfWeek.THURSDAY, tom));
//        sharedTripList.add(new SharedTrip(DayOfWeek.THURSDAY, mary));
//        sharedTripList.add(new SharedTrip(DayOfWeek.THURSDAY, annie));
//        sharedTripList.add(new SharedTrip(DayOfWeek.THURSDAY, sammy));
//        sharedTripList.add(new SharedTrip(DayOfWeek.THURSDAY, peter));
//        sharedTripList.add(new SharedTrip(DayOfWeek.FRIDAY, tom));
//        sharedTripList.add(new SharedTrip(DayOfWeek.FRIDAY, mary));
//        sharedTripList.add(new SharedTrip(DayOfWeek.FRIDAY, annie));
//        sharedTripList.add(new SharedTrip(DayOfWeek.FRIDAY, peter));
//        sharedTripList.add(new SharedTrip(DayOfWeek.FRIDAY, sammy));
//        return new DayPersonAllocation(personList, carList, sharedTripList);
//    }
}
