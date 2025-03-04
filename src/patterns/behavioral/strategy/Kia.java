package patterns.behavioral.strategy;

import patterns.behavioral.strategy.strategies.DieselFillStrategy;

public class Kia extends Auto {

    public Kia() {
        this.strategy = new DieselFillStrategy();
    }
}
