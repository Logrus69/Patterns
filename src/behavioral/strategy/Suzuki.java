package behavioral.strategy;

import behavioral.strategy.interfaces.FillStrategy;

public class Suzuki extends Auto{

    public Suzuki() {
        this.strategy = new GasolineFillStrategy();
    }
}
