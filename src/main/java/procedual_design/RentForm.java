package procedual_design;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class RentForm {
    private LocalDateTime from;
    private LocalDateTime to;
    private Car car;
    private User user;
}
