package patterns.generative.builder.withdirector.interfaces;

import patterns.generative.builder.withdirector.Car;

public interface CarBuilder {

    // Этап 1
    public CarBuilder fixChassis();

    // Этап 2
    public CarBuilder fixBody();

    // Этап 3
    public CarBuilder paint();

    // Этап 4

    public CarBuilder fixInterior();

    // Выпуск автомобиля

    public Car build();
}
