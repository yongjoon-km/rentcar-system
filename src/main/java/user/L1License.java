package user;

import car.Car;
import car.CarType;

public class L1License implements License {
    @Override
    public boolean canDrive(Car car) {
        return car.getCarType() == CarType.SMALL || car.getCarType() == CarType.MIDDLE;
    }
}
