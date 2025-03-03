package pattern.builder.withdirector;

import pattern.builder.withdirector.interfaces.CarBuilder;

public class AutomotiveEngineer {
    private final CarBuilder builder;

    public AutomotiveEngineer(CarBuilder builder) {
        this.builder = builder;
        if (this.builder == null) {
            throw new IllegalArgumentException("Automotive Engineer can't work without Car Builder!");
        }
    }

    public Car manufactureCar() {
        return builder.fixChassis().fixBody().paint().fixInterior().build();
    }
}
