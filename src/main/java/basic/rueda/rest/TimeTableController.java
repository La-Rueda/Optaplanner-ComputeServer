package basic.rueda.rest;

import java.util.UUID;
import java.util.concurrent.ExecutionException;

import basic.rueda.domain.CarPersonAllocation;
import org.optaplanner.core.api.solver.SolverJob;
import org.optaplanner.core.api.solver.SolverManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/timeTable")
public class TimeTableController {

    @Autowired
    private SolverManager<CarPersonAllocation, UUID> solverManager;

    @PostMapping("/solve")
    public CarPersonAllocation solve(@RequestBody CarPersonAllocation problem) {
        UUID problemId = UUID.randomUUID();
        // Submit the problem to start solving
        SolverJob<CarPersonAllocation, UUID> solverJob = solverManager.solve(problemId, problem);
        CarPersonAllocation solution;
        try {
            // Wait until the solving ends
            solution = solverJob.getFinalBestSolution();

            // TODO: Assign passengers (persons different to driver)
//            assignPassengers(solution);

        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException("Solving failed.", e);
        }
        return solution;
    }


    /**
     * this function assigns Passengers to a SharedTrip
     * @param solution Return solution object modified
     */
//    private void assignPassengers(DayPersonAllocation solution){
//        solution.getSharedTripList().forEach(element -> {
//            Person driver = element.getDriver();
//            System.out.println("DRIVER: "+ driver.getName());
//
////                System.out.println("ELEMENT: "+ element.getDriver().getCar().getModel());
//            //.forEach(e -> System.out.println("E: "+ e));
//            solution.getPersonList().stream()
//                    .filter(person ->
//                            person.getName().compareTo(driver.getName()) != 0)
//                    .forEach(personToAdd -> element.getPassengersList().add(personToAdd));
//        });
//    }

//    /**
//     *
//     * @param totalDays
//     * @param daysPerson
//     * @param oldFactor
//     * @return
//     */
//    private Double computeNewFactor(Integer totalDays, Integer daysPerson, Double oldFactor){
//        try {
//            Double newFactor;
//            if (oldFactor == 0) {
//                newFactor = new Double(daysPerson) / totalDays;
//            } else {
//
//                newFactor = oldFactor + (daysPerson / totalDays) / 2;
//            }
//                return newFactor;
//        }catch(Error err){
//            throw err;
//        }
//    }
//
//    /**
//     * This function returns the number of days a person drives
//     * @param solution solution of DayPersonAllocation
//     * @param person Person to get driven days
//     * @return Number of drives of a person
//     */
//    private Integer getDrivenDaysByPerson(DayPersonAllocation solution, Person person){
//        // See if is driver of some day
//        AtomicInteger times = new AtomicInteger(0);
//        solution.getSharedTripList().forEach(sharedtrip -> {
//            if(sharedtrip.getDriver().getName().equals(person.getName())){
//                // This person drives
//                times.getAndIncrement();
//            }
//        });
//        System.out.println(person.getName() + "drives " + times + "times this week");
//        return times.get();
//    }
}
