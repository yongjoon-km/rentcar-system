package user;

import car.Car;

public class User {

    private License license;

    public User(License license) {
        this.license = license;
    }

    public boolean canDrive(Car car) {
        return license.canDrive(car);
    }
}
