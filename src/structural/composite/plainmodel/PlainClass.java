package structural.composite.plainmodel;

import structural.composite.Component;
import structural.composite.Composite;

public class PlainClass extends Composite {
    private final int armchairCount;
    private final float maxWeightPerPassenger;

    public PlainClass(String componentId, int armchairCount, float maxWeightPerPassenger) {
        super(componentId);
        this.armchairCount = armchairCount;
        this.maxWeightPerPassenger = maxWeightPerPassenger;
    }

    @Override
    public boolean appendChild(Component child) {
        if (getChildren().size() >= armchairCount) {
            System.out.println("You cannot create more items of this type!");
            return false;
        } else
            return super.appendChild(child);
    }

    @Override
    public float getMaxWeightPerComponent() {
        return maxWeightPerPassenger;
    }
}
