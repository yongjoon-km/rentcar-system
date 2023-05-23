package object_oriented.car;

import object_oriented.user.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class RentInfo {
    private LocalDateTime from;
    private LocalDateTime to;
    private User user;
    private BigDecimal price;

    public RentInfo(LocalDateTime from, LocalDateTime to, User user, BigDecimal price) {
        this.from = from;
        this.to = to;
        this.user = user;
        this.price = price;
    }

}
