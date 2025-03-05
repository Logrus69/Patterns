package patterns.structural.composite;

import java.util.Optional;

public class FBIClient {

    private final Composite plain;

    public FBIClient(Composite plain) {
        this.plain = plain;
    }

    public Optional<Component> findAndShowResult(String id) {
        Optional<Component> component = plain.findRequiredComponentBy(id);

        if (!component.isPresent())
            System.out.println("Component with id: " + id + " not found");
        else
            System.out.println("Component: " + id + " found");

        return component;
    }

    public void removeComponent(String id) {
        Optional<Component> component = findAndShowResult(id);

        if (component.isPresent()) {
            System.out.println("The FBI is clearing...");
            plain.remove(component.get());
        }

    }
}
