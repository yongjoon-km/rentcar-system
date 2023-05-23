package object_oriented.car;

import java.time.Duration;
import java.time.LocalDateTime;

public class RentTime {
    private LocalDateTime from;
    private LocalDateTime to;

    public RentTime(LocalDateTime from, LocalDateTime to) {
        this.from = from;
        this.to = to;
    }

    public boolean hasCommonTimeSlot(RentTime rentTime) {

        if (this.from.isAfter(rentTime.from) && this.from.isBefore(rentTime.to)) {
            return true;
        }
        if (this.to.isBefore(rentTime.to) && this.to.isAfter(rentTime.from)) {
            return true;
        }
        return false;
    }

    public Long getHours() {
        return Duration.between(from, to).toHours();
    }
}
