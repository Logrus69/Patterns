package behavioral.strategy;

import behavioral.strategy.interfaces.FillStrategy;

public class GasolineFillStrategy implements FillStrategy {
    @Override
    public void fill() {
        System.out.println("Refueling only 95 with gasoline");
    }
}
