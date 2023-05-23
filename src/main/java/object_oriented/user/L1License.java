package object_oriented.user;

import object_oriented.car.Car;
import object_oriented.car.CarType;

public class L1License implements License {
    @Override
    public boolean canDrive(Car car) {
        return car.getCarType() == CarType.SMALL || car.getCarType() == CarType.MIDDLE;
    }
}
