package behavioral.strategy;

public class Tesla extends Auto{

    public Tesla() {
        this.strategy = new HybridFillStrategy();
    }
}
