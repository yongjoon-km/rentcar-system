import car.*;
import car.rent_policy.AvailableTimeRentableStrategy;
import car.rent_policy.MinimumTimeRentableStrategy;
import user.L1License;
import user.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class App {

    public static void main(String[] argv) {
        User user = new User(new L1License());
        Car car = new Car(CarType.BIG);
        RentableCar rentableCar = new RentableCar(
                car,
                BigDecimal.TEN,
                List.of(),
                List.of(new AvailableTimeRentableStrategy(),
                        new MinimumTimeRentableStrategy()));
        try {
            RentInfo rentInfo = rentableCar.rentCar(
                    user,
                    LocalDateTime.now(),
                    LocalDateTime.now().plusHours(2));
        } catch (RuntimeException e) {
            System.out.println("Failed to rent a car");
        }
    }
}
