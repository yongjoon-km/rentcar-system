package procedual_design;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

public class RentCarService {

    public RentResponse rentCar(RentForm rentForm) {
        if (!canUserDriveTheCar(rentForm)) {
            return null;
        }
        if (!isCarRentable(rentForm)) {
            return null;
        }
        BigDecimal rentFee = calculateFee(rentForm);
        return new RentResponse(
                rentForm.getUser(),
                rentForm.getCar(),
                rentForm.getFrom(),
                rentForm.getTo(),
                rentFee
        );
    }

    private BigDecimal calculateFee(RentForm rentForm) {
        long rentHours = Duration.between(rentForm.getFrom(), rentForm.getTo()).toHours();
        return rentForm.getCar().getFee().multiply(BigDecimal.valueOf(rentHours));
    }

    private boolean isCarRentable(RentForm rentForm) {
        if (Duration.between(rentForm.getFrom(), rentForm.getTo()).toHours() < 2L) {
            return false;
        }

        return rentForm.getCar().getReservedTime()
                .stream()
                .noneMatch(p -> isConflict(p, rentForm.getFrom(), rentForm.getTo()));
    }

    private boolean isConflict(Pair<LocalDateTime, LocalDateTime> carReservedTime, LocalDateTime from, LocalDateTime to) {
        LocalDateTime carFrom = carReservedTime.getFirst();
        LocalDateTime carTo = carReservedTime.getSecond();

        if (carFrom.isAfter(from) && carFrom.isBefore(to)) {
            return true;
        }
        if (carTo.isBefore(to) && carTo.isAfter(from)) {
            return true;
        }
        return false;
    }

    private boolean canUserDriveTheCar(RentForm rentForm) {
        User user = rentForm.getUser();
        Car car = rentForm.getCar();

        if (user == null || car == null) {
            return false;
        }

        switch(user.getLicense()) {
            case L1:
                return car.getCarType() == CarType.SMALL || car.getCarType() == CarType.MIDDLE;
            case L2:
                return car.getCarType() == CarType.BIG;
            default:
                return false;
        }
    }


}
