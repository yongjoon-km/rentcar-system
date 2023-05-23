package car.rent_policy;

import car.RentTime;
import car.RentableCar;

public class MinimumTimeRentableStrategy implements RentableTimeStrategy {
    private static final Long MINIMUM_HOURS = 2L;

    @Override
    public boolean isAvailable(RentableCar rentableCar, RentTime rentTime) {
        return rentTime.getHours() > MINIMUM_HOURS;
    }
}
