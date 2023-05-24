package procedual_design;

import java.time.LocalDateTime;

public class RentForm {
    private LocalDateTime from;
    private LocalDateTime to;
    private Car car;
    private User user;

    public RentForm(LocalDateTime from, LocalDateTime to, Car car, User user) {
        this.from = from;
        this.to = to;
        this.car = car;
        this.user = user;
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

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
