package pattern.behavioral.strategy;

import pattern.behavioral.strategy.strategies.HybridFillStrategy;

public class Tesla extends Auto {

    public Tesla() {
        this.strategy = new HybridFillStrategy();
    }
}
