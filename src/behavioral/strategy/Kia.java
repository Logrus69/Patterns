package behavioral.strategy;

public class Kia extends Auto{

    public Kia() {
        this.strategy = new DieselFillStrategy();
    }
}
