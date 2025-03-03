package pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class DeveloperFactory {
    private static final Map<String, Developer> developerMap = new HashMap<>();

    public static Developer getDeveloperBySpecialty(String specialty) {

        Developer developer= developerMap.get(specialty);
        if (Objects.isNull(developer)) {
            switch (specialty) {
                case "Java" :
                    System.out.println("Created Java developer");
                    developer = new JavaDeveloper();
                    break;
                case "C++" :
                    System.out.println("Created C++ developer");
                    developer = new CppDeveloper();
                    break;
                default:
                    System.out.println("There is no any developer with specialty " + specialty);
            }
            developerMap.put(specialty, developer);
        }
        return developer;
    }
}
