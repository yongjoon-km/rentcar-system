package car;

import car.rent_policy.RentableTimeStrategy;
import user.User;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class RentableCar {

    private Car car;
    private BigDecimal fee;
    private List<RentTime> reservedTime;
    private List<RentableTimeStrategy> rentableTimeStrategies;

    public RentableCar(Car car, BigDecimal fee, List<RentTime> reservedTime, List<RentableTimeStrategy> rentableTimeStrategies) {
        this.car = car;
        this.fee = fee;
        this.reservedTime = reservedTime;
        this.rentableTimeStrategies = rentableTimeStrategies;
    }

    public RentInfo rentCar(User user, LocalDateTime from, LocalDateTime to) {
        if (!user.canDrive(this.car)) {
            throw new RuntimeException();
        }
        if (!isAvailableByPolicy(new RentTime(from, to))) {
            throw new RuntimeException();
        }
        BigDecimal fee = BigDecimal.valueOf(Duration.between(from, to).toHours()).multiply(this.fee);
        return new RentInfo(from, to, user, fee);
    }

    private boolean isAvailableByPolicy(RentTime rentTime) {
        return rentableTimeStrategies.stream()
                .allMatch(s -> s.isAvailable(this, rentTime));
    }

    public boolean isReservedIn(RentTime rentTime) {
        return reservedTime.stream().anyMatch(r -> r.hasCommonTimeSlot(rentTime));
    }
}
