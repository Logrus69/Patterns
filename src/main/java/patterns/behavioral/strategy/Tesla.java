package patterns.behavioral.strategy;

import patterns.behavioral.strategy.strategies.HybridFillStrategy;

public class Tesla extends Auto {

    public Tesla() {
        this.strategy = new HybridFillStrategy();
    }
}
