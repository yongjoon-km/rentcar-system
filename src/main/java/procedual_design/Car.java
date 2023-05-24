package procedual_design;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@AllArgsConstructor
public class Car {
    private CarType carType;
    private List<Pair<LocalDateTime, LocalDateTime>> reservedTime;
    private BigDecimal fee;
}
