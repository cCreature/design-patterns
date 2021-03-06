package pl.arnonedev.decorator.decorator;

import pl.arnonedev.decorator.car.Car;

/**
 * Created by Arek on 2017-04-20.
 */
public class Seats extends CarDecorator {
    private Car car;

    public Seats(Car car) {
        this.car = car;
    }

    @Override
    public double price() {
        return car.price() + 30000;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", leatcher seats";
    }
}
