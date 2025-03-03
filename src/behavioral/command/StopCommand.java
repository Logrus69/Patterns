package behavioral.command;
//ConcreteCommand
public class StopCommand extends Command{

    public StopCommand(Comp computer) {
        super(computer);
    }

    @Override
    public void execute() {
        computer.stop();
    }
}
