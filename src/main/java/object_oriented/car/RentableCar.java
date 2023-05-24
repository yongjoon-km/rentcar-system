package object_oriented.car;

import object_oriented.car.rent_policy.RentableTimeStrategy;
import object_oriented.user.User;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class RentableCar {

    private Car car;
    private BigDecimal fee;
    private List<RentTime> reservedTime;
    private RentableTimeStrategy rentableTimeStrategy;

    public RentableCar(Car car, BigDecimal fee, List<RentTime> reservedTime, RentableTimeStrategy rentableTimeStrategy) {
        this.car = car;
        this.fee = fee;
        this.reservedTime = reservedTime;
        this.rentableTimeStrategy = rentableTimeStrategy;
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
        return rentableTimeStrategy.isAvailable(this, rentTime);
    }

    public boolean isReservedIn(RentTime rentTime) {
        return reservedTime.stream().anyMatch(r -> r.hasCommonTimeSlot(rentTime));
    }
}
