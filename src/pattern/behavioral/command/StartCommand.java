package pattern.behavioral.command;
//ConcreteCommand
public class StartCommand extends Command {

    public StartCommand(Comp computer) {
        super(computer);
    }

    @Override
    public void execute() {
        computer.start();
    }
}
