package behavioral.strategy;

import behavioral.strategy.strategies.DieselFillStrategy;

public class Kia extends Auto {

    public Kia() {
        this.strategy = new DieselFillStrategy();
    }
}
