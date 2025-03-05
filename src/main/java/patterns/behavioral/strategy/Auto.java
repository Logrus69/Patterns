package patterns.behavioral.strategy;

import patterns.behavioral.strategy.interfaces.FillStrategy;

public class Auto {

    FillStrategy strategy;

    public void fill() {
        strategy.fill();
    }

    public void gas() {
        System.out.println("Let's go!");
    }

    public void stop() {
        System.out.println("Stop!");
    }

    public void setStrategy(FillStrategy strategy) {
        this.strategy = strategy;
    }
}
