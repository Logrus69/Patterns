package pattern.behavioral.strategy;

import pattern.behavioral.strategy.strategies.DieselFillStrategy;

public class Kia extends Auto {

    public Kia() {
        this.strategy = new DieselFillStrategy();
    }
}
