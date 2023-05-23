package object_oriented.car.rent_policy;

import object_oriented.car.RentTime;
import object_oriented.car.RentableCar;

public class MinimumTimeRentableStrategy implements RentableTimeStrategy {
    private static final Long MINIMUM_HOURS = 2L;

    @Override
    public boolean isAvailable(RentableCar rentableCar, RentTime rentTime) {
        return rentTime.getHours() > MINIMUM_HOURS;
    }
}
