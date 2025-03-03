package pattern.behavioral.command;
//ConcreteCommand
public class ResetCommand extends Command{

    public ResetCommand(Comp computer) {
        super(computer);
    }

    @Override
    public void execute() {
        computer.reset();
    }
}
