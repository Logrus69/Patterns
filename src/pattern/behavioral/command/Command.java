package pattern.behavioral.command;

public abstract class Command {

    Comp computer;

    public Command(Comp computer) {
        this.computer = computer;
    }

    abstract void execute();
}
