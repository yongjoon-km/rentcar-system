package car.rent_policy;

import car.RentTime;
import car.RentableCar;

public class AvailableTimeRentableStrategy implements RentableTimeStrategy {
    @Override
    public boolean isAvailable(RentableCar rentableCar, RentTime rentTime) {
        if (!rentableCar.isReservedIn(rentTime)) {
            return true;
        }
        return false;
    }
}
