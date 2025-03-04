package patterns.behavioral.strategy.strategies;

import patterns.behavioral.strategy.interfaces.FillStrategy;

public class DieselFillStrategy  implements FillStrategy {
    @Override
    public void fill() {
        System.out.println("Refueling only 95 with diesel");
    }
}
