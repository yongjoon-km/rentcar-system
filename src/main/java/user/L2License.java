package user;

import car.Car;
import car.CarType;

public class L2License implements License {
    @Override
    public boolean canDrive(Car car) {
        return car.getCarType() == CarType.BIG;
    }
}
