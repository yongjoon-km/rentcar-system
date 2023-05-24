package procedual_design;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class RentResponse {
    private User user;
    private Car car;
    private LocalDateTime from;
    private LocalDateTime to;
    private BigDecimal fee;
}
