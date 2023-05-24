package object_oriented;

import object_oriented.car.Car;
import object_oriented.car.CarType;
import object_oriented.car.RentInfo;
import object_oriented.car.RentableCar;
import object_oriented.car.rent_policy.AvailableTimeRentableStrategy;
import object_oriented.car.rent_policy.MinimumTimeRentableStrategy;
import object_oriented.user.L1License;
import object_oriented.user.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class App {

    public static void main(String[] argv) {
        User user = new User(new L1License());
        Car car = new Car(CarType.SMALL);
        RentableCar rentableCar = new RentableCar(
                car,
                BigDecimal.TEN,
                List.of(),
                new AvailableTimeRentableStrategy());
        try {
            RentInfo rentInfo = rentableCar.rentCar(
                    user,
                    LocalDateTime.now(),
                    LocalDateTime.now().plusHours(4));
            System.out.println(rentInfo);

        } catch (RuntimeException e) {
            System.out.println("Failed to rent a car");
        }
    }
}
