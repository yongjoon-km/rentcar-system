package object_oriented.car;

import lombok.Getter;

@Getter
public class Car {
    private CarType carType;

    public Car(CarType carType) {
        this.carType = carType;
    }
}
