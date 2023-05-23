package object_oriented.car.rent_policy;

import object_oriented.car.RentTime;
import object_oriented.car.RentableCar;

public class AvailableTimeRentableStrategy implements RentableTimeStrategy {
    @Override
    public boolean isAvailable(RentableCar rentableCar, RentTime rentTime) {
        if (!rentableCar.isReservedIn(rentTime)) {
            return true;
        }
        return false;
    }
}
