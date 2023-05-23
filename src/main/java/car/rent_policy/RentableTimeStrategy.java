package car.rent_policy;

import car.RentTime;
import car.RentableCar;

public interface RentableTimeStrategy {
    boolean isAvailable(RentableCar rentableCar, RentTime rentTime);
}
