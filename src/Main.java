import behavioral.strategy.*;

public class Main {

    public static void main(String[] args) {
        Kia kia = new Kia();
        Suzuki suzuki= new Suzuki();
        Tesla tesla = new Tesla();

        kia.fill();
        suzuki.fill();
        tesla.fill();
        tesla.setStrategy(new DieselFillStrategy());
        System.out.println("");
        tesla.fill();
        tesla.gas();
    }
}
