package patterns.structural.composite.plainmodel;

import patterns.structural.composite.Component;
import patterns.structural.composite.Composite;

public class Passenger extends Composite {

    public Passenger(String componentId) {
        super(componentId);
    }

    @Override
    public void checkOverweight() {
        float allWeight = getAllWeight();

        if (allWeight > getMaxWeightPerComponent()) {
            System.out.println("Passenger overweight found!");
        }
    }

    @Override
    public float getAllWeight() {
        float allWeight = 0;

        for (Component child : getChildren()) {
            allWeight += child.getAllWeight();
        }
        return allWeight;
    }

    @Override
    public float getMaxWeightPerComponent() {
        return getParent().getMaxWeightPerComponent();
    }
}
