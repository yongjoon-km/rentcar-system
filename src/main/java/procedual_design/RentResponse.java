package procedual_design;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class RentResponse {
    private User user;
    private Car car;
    private LocalDateTime from;
    private LocalDateTime to;
    private BigDecimal fee;

    public RentResponse(User user, Car car, LocalDateTime from, LocalDateTime to, BigDecimal fee) {
        this.user = user;
        this.car = car;
        this.from = from;
        this.to = to;
        this.fee = fee;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public void setFrom(LocalDateTime from) {
        this.from = from;
    }

    public LocalDateTime getTo() {
        return to;
    }

    public void setTo(LocalDateTime to) {
        this.to = to;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }
}
