package pattern.behavioral.strategy.strategies;

import pattern.behavioral.strategy.interfaces.FillStrategy;

public class HybridFillStrategy implements FillStrategy {
    @Override
    public void fill() {
        System.out.println("Electricity refueling");
    }
}
