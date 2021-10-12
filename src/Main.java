import behavioral.strategy.*;
import behavioral.strategy.strategies.DieselFillStrategy;
import generative.builder.AutomotiveEngineer;
import generative.builder.builders.ClassicCarBuilder;
import generative.builder.interfaces.CarBuilder;

public class Main {

    public static void main(String[] args) {
        /**Strategy**/
        /*Kia kia = new Kia();
        Suzuki suzuki= new Suzuki();
        Tesla tesla = new Tesla();

        kia.fill();
        suzuki.fill();
        tesla.fill();
        tesla.setStrategy(new DieselFillStrategy());
        System.out.println("");
        tesla.fill();
        tesla.gas();*/

        /**Builder**/
        /*CarBuilder builder = new ClassicCarBuilder();
        AutomotiveEngineer engineer = new AutomotiveEngineer(builder);
        engineer.manufactureCar();*/
    }
}
