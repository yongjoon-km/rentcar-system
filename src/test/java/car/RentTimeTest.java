package car;

import object_oriented.car.RentTime;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class RentTimeTest {

    @Test
    public void should_have_common_time_slot() {

        LocalDateTime rentTime1From = LocalDateTime.of(2023,5,23,12,0,0);
        LocalDateTime rentTime1To = LocalDateTime.of(2023,5,25,12,0,0);

        LocalDateTime rentTime2From = LocalDateTime.of(2023,5,19,12,0,0);
        LocalDateTime rentTime2To = LocalDateTime.of(2023,5,25,12,0,0);

        RentTime rentTime1 = new RentTime(rentTime1From, rentTime1To);
        RentTime rentTime2 = new RentTime(rentTime2From, rentTime2To);

        assertTrue(rentTime1.hasCommonTimeSlot(rentTime2));
    }

}