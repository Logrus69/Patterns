package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

//https://refactoring.guru/ru/design-patterns/flyweight
public interface Developer {

    default void writeCode() {
        System.out.println("Write code!");
    }
}

    //_-_-_-_-_-_-_-_-_MOVE TO MAIN CLASS_-_-_-_-_-_-_-_-_
    /*List<Developer> developerList = new ArrayList<>();
        developerList.add(DeveloperFactory.getDeveloperBySpecialty("Java"));
                developerList.add(DeveloperFactory.getDeveloperBySpecialty("Java"));
                developerList.add(DeveloperFactory.getDeveloperBySpecialty("Java"));
                developerList.add(DeveloperFactory.getDeveloperBySpecialty("Java"));
                developerList.add(DeveloperFactory.getDeveloperBySpecialty("Java"));
                developerList.add(DeveloperFactory.getDeveloperBySpecialty("Java"));
                developerList.add(DeveloperFactory.getDeveloperBySpecialty("C++"));
                developerList.add(DeveloperFactory.getDeveloperBySpecialty("C++"));
                developerList.add(DeveloperFactory.getDeveloperBySpecialty("C++"));
                developerList.add(DeveloperFactory.getDeveloperBySpecialty("C++"));
                developerList.add(DeveloperFactory.getDeveloperBySpecialty("C++"));
                developerList.add(DeveloperFactory.getDeveloperBySpecialty("C++"));

                for (Developer d : developerList) {
                d.writeCode();
                }*/
