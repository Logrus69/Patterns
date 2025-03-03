package pattern.behavioral.strategy;

import pattern.behavioral.strategy.strategies.GasolineFillStrategy;

public class Suzuki extends Auto {

    public Suzuki() {
        this.strategy = new GasolineFillStrategy();
    }
}
