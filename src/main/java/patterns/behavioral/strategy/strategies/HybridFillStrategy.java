package patterns.behavioral.strategy.strategies;

import patterns.behavioral.strategy.interfaces.FillStrategy;

public class HybridFillStrategy implements FillStrategy {
    @Override
    public void fill() {
        System.out.println("Electricity refueling");
    }
}
