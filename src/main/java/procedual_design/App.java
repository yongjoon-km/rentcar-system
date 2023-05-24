package procedual_design;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class App {


    public static void main(String[] argv) {

        User user = new User(License.L1);
        Car car = new Car(CarType.SMALL, List.of(), BigDecimal.TEN);

        RentForm rentForm = new RentForm(
                LocalDateTime.of(2023,5,13,12,0,0),
                LocalDateTime.of(2023,5,15,12,0,0),
                car,
                user);

        RentCarService rentCarService = new RentCarService();
        RentResponse rentResponse = rentCarService.rentCar(rentForm);
        System.out.println(rentResponse);
    }
}
