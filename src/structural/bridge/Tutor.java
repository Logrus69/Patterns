package structural.bridge;

public class Tutor extends Education{

    public Tutor(Language language) {
        super(language);
    }

    @Override
    void whoWillTeach() {
        System.out.println("You will be taught by a tutor");
    }
}
