package pattern.structural.composite;

public interface Component {

    void setParent(Component component);

    Component getParent();
    String getId();

    void checkOverweight();

    float getAllWeight();

    float getMaxWeightPerComponent();

    void show();
}
