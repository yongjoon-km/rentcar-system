package procedual_design;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Car {
    private CarType carType;
    private List<Pair<LocalDateTime, LocalDateTime>> reservedTime;
    private BigDecimal fee;

    public Car(CarType carType, List<Pair<LocalDateTime, LocalDateTime>> reservedTime, BigDecimal fee) {
        this.carType = carType;
        this.reservedTime = reservedTime;
        this.fee = fee;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public List<Pair<LocalDateTime, LocalDateTime>> getReservedTime() {
        return reservedTime;
    }

    public void setReservedTime(List<Pair<LocalDateTime, LocalDateTime>> reservedTime) {
        this.reservedTime = reservedTime;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }
}
