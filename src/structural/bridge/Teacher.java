package structural.bridge;

public class Teacher extends Education{

    public Teacher(Language language) {
        super(language);
    }

    @Override
    void whoWillTeach() {
        System.out.println("You will be taught by a teacher");
    }
}
