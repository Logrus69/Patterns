package pattern.structural.bridge;

public class Coach extends Education{

    public Coach(Language language) {
        super(language);
    }

    @Override
    void whoWillTeach() {
        System.out.println("You will be taught by a coach");
    }
}
