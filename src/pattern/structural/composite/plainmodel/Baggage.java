package pattern.structural.composite.plainmodel;

import pattern.structural.composite.Component;

public class Baggage implements Component {

    private final Component parent;
    private final float weight;

    public Baggage(Component parent, float weight) {
        this.parent = parent;
        this.weight = weight;
    }

    @Override
    public void setParent(Component component) {
        return;
    }

    @Override
    public Component getParent() {
        return parent;
    }

    @Override
    public String getId() {
        return "Baggage belongs: " + getParent().getId();
    }

    @Override
    public void checkOverweight() {
        return;
    }

    @Override
    public float getAllWeight() {
        return weight;
    }

    @Override
    public float getMaxWeightPerComponent() {
        return getParent().getMaxWeightPerComponent();
    }

    @Override
    public void show() {
        System.out.println(getId());
    }
}
