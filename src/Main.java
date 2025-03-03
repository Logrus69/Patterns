import behavioral.command.*;
import generative.builder.withdirector.AutomotiveEngineer;
import generative.builder.withdirector.builders.ClassicCarBuilder;
import generative.builder.withdirector.interfaces.CarBuilder;
import structural.bridge.Coach;
import structural.bridge.Education;
import structural.bridge.English;
import structural.composite.FBIClient;
import structural.composite.PlainTerminal;
import structural.composite.plainmodel.Baggage;
import structural.composite.plainmodel.Passenger;
import structural.composite.plainmodel.PlainBody;
import structural.composite.plainmodel.PlainClass;
import structural.flyweight.Developer;
import structural.flyweight.DeveloperFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

       /**Bridge**/
        /*Education coach = new Coach(new English());
        coach.showDetails();*/

        /*Comp computer = new Comp();
        User user = new User(new StartCommand(computer), new StopCommand(computer), new ResetCommand(computer));

        user.startComputer();
        user.stopComputer();
        user.resetComputer();*/


    }
}