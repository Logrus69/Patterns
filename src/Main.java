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