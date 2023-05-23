package object_oriented.car.rent_policy;

import object_oriented.car.RentTime;
import object_oriented.car.RentableCar;

public interface RentableTimeStrategy {
    boolean isAvailable(RentableCar rentableCar, RentTime rentTime);
}
