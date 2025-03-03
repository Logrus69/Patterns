package pattern.structural.bridge;

public class English implements Language {

    @Override
    public void whatLanguageWillWeLearn() {
        System.out.println("We will learn English");
    }
}
