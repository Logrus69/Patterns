package behavioral.strategy;

import behavioral.strategy.strategies.HybridFillStrategy;

public class Tesla extends Auto{

    public Tesla() {
        this.strategy = new HybridFillStrategy();
    }
}
