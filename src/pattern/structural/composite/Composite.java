package pattern.structural.composite;

import java.util.*;

//https://refactoring.guru/ru/design-patterns/composite
public abstract class Composite implements Component {
    private List<Component> children = new ArrayList<>();
    private Component parent;

    private final String componentId;

    public Composite(String componentId) {
        this.componentId = componentId;
    }

    @Override
    public String getId() {
        return this.componentId;
    }

    @Override
    public Component getParent() {
        return parent;
    }

    @Override
    public void checkOverweight() {
        for(Component child : children) {
            child.checkOverweight();
        }
    }

    @Override
    public float getAllWeight() {
        return 0;
    }

    @Override
    public float getMaxWeightPerComponent() {
        return 0;
    }

    @Override
    public void setParent(Component component) {
        parent = component;
    }

    public boolean appendChild(Component child) {
        child.setParent(this);
        return children.add(child);
    }

    public List<Component> getChildren() {
        return children;
    }

    public Optional<Component> findRequiredComponentBy(String id) {
        Optional<Component> childComponent =
                getChildren().stream().filter(child -> Objects.equals(child.getId(), id)).findFirst();

        if (childComponent.isPresent()) return childComponent;

        for (Component child : getChildren()) {
            if (child instanceof Composite) {
                Optional<Component> component = ((Composite) child).findRequiredComponentBy(child.getId());
                if (component.isPresent()) return component;
            }
        }
        return Optional.empty();
    }

    public boolean remove(Component child) {

        Iterator<Component> childrenIterator = children.iterator();

        while (childrenIterator.hasNext()) {
            Component childComponent = childrenIterator.next();
            if (Objects.equals(child.getId(), childComponent.getId())) {
                childrenIterator.remove();
                System.out.println("Element was removed: id = " + child.getId());
                return true;
            } else {
                if (childComponent instanceof Composite) {
                    Composite childComposite = (Composite) childComponent;
                    return childComposite.remove(child);
                }
            }
        }
        return false;
    }

    @Override
    public void show() {
        System.out.println("Node: " + getId() + "\n");

        System.out.println("Child node: ");
        for (Component child : children) {
            child.show();
        }
    }
}

        //_-_-_-_-_-_-_-_-_MOVE TO MAIN CLASS_-_-_-_-_-_-_-_-_
    /*//Корпус
    PlainBody plain = new PlainBody("Airbus", 3);
    //Класс обслуживания
    PlainClass firstClass = new PlainClass("First class", 5, Integer.MAX_VALUE);
    PlainClass businessClass = new PlainClass("Business clas", 10, Integer.MAX_VALUE);
    PlainClass economyClass = new PlainClass("Economy class", 20, 30);

    Passenger deviant = new Passenger("Deviant");
    List<Passenger> firstClassPassenger =
            Arrays.asList(
                    new Passenger("Alexander"),
                    new Passenger("Gamma"),
                    new Passenger("Helm"),
                    new Passenger("Jonson"),
                    new Passenger("Voles"));

        firstClass.appendChild(deviant);

                for (Passenger passenger : firstClassPassenger) {
                passenger.appendChild(new Baggage(passenger, 30));
                firstClass.appendChild(passenger);
                }

                List<Passenger> businessClassPassenger =
        Arrays.asList(
        new Passenger("Vlad"),
        new Passenger("Oleg"),
        new Passenger("Arthur"),
        new Passenger("Max"),
        new Passenger("Kirill"));

        for (Passenger passenger : businessClassPassenger) {
        passenger.appendChild(new Baggage(passenger, 50));
        businessClass.appendChild(passenger);
        }

        List<Passenger> economyClassPassenger =
        Arrays.asList(
        new Passenger("Voldemar"),
        new Passenger("Homa"),
        new Passenger("Renat"),
        new Passenger("Ibrahim"),
        new Passenger("Ricardo"));

        for (Passenger passenger : economyClassPassenger) {
        passenger.appendChild(new Baggage(passenger, 5));
        economyClass.appendChild(passenger);
        }
        Passenger overWeight = new Passenger("Maria");
        overWeight.appendChild(new Baggage(overWeight, 15));
        overWeight.appendChild(new Baggage(overWeight, 25));

        economyClass.appendChild(overWeight);

        plain.appendChild(firstClass);
        plain.appendChild(businessClass);
        plain.appendChild(economyClass);

        //Клиент
        PlainTerminal plainTerminal = new PlainTerminal(plain);
        plainTerminal.showPlainStructure();
        plainTerminal.checkOverview();

        FBIClient fbiClient = new FBIClient(plain);

        fbiClient.removeComponent("Deviant");

        plainTerminal.showPlainStructure();*/
