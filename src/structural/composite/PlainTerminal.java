package structural.composite;

public class PlainTerminal {

    private final Composite plain;

    public PlainTerminal(Composite plain) {
        this.plain = plain;
    }

    public void showPlainStructure() {
        plain.show();
    }

    public void checkOverview() {
        plain.checkOverweight();
    }
}
