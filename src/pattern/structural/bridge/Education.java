package pattern.structural.bridge;

public abstract class Education {

    Language language;

    public Education(Language language) {
        this.language = language;
    }

    abstract void whoWillTeach();
    public void showDetails() {
        whoWillTeach();
        language.whatLanguageWillWeLearn();
    }
}
