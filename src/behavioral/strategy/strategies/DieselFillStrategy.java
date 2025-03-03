package behavioral.strategy.strategies;

import behavioral.strategy.interfaces.FillStrategy;

public class DieselFillStrategy  implements FillStrategy {
    @Override
    public void fill() {
        System.out.println("Refueling only 95 with diesel");
    }
}
