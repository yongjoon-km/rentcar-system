package object_oriented.user;

import object_oriented.car.Car;

public class User {

    private License license;

    public User(License license) {
        this.license = license;
    }

    public boolean canDrive(Car car) {
        return license.canDrive(car);
    }
}
