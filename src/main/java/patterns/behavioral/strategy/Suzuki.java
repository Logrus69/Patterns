package patterns.behavioral.strategy;

import patterns.behavioral.strategy.strategies.GasolineFillStrategy;

public class Suzuki extends Auto {

    public Suzuki() {
        this.strategy = new GasolineFillStrategy();
    }
}
