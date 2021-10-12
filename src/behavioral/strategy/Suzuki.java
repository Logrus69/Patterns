package behavioral.strategy;

import behavioral.strategy.strategies.GasolineFillStrategy;

public class Suzuki extends Auto{

    public Suzuki() {
        this.strategy = new GasolineFillStrategy();
    }
}
