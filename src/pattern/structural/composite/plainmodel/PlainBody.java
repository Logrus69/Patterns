package pattern.structural.composite.plainmodel;

import pattern.structural.composite.Component;
import pattern.structural.composite.Composite;

public class PlainBody extends Composite {

    private final int maxClassCount;

    public PlainBody(String componentId,  int maxClassCount) {
        super(componentId);
        this.maxClassCount = maxClassCount;
    }

    @Override
    public boolean appendChild(Component child) {
        if (getChildren().size() >= maxClassCount) {
            System.out.println("You cannot create more items of this type!");
            return false;
        }
        else {
            return super.appendChild(child);
        }
    }
}
