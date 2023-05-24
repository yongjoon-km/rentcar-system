package object_oriented.car;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import object_oriented.user.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class RentInfo {
    private final LocalDateTime from;
    private final LocalDateTime to;
    private final User user;
    private final BigDecimal price;
}
