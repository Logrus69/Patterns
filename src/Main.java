import generative.builder.withdirector.AutomotiveEngineer;
import generative.builder.withdirector.builders.ClassicCarBuilder;
import generative.builder.withdirector.interfaces.CarBuilder;
import structural.bridge.Coach;
import structural.bridge.Education;
import structural.bridge.English;

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
        CarBuilder builder = new ClassicCarBuilder();
        AutomotiveEngineer engineer = new AutomotiveEngineer(builder);
        engineer.manufactureCar();

        /**Bridge**/
        Education coach = new Coach(new English());
        coach.showDetails();
    }
}
