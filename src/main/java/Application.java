import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class Application {

    static Logger logger = Logger.getLogger(Application.class.getName());

    public static void main(String[] args) {
        logger.info("Hello World");
        SpringApplication.run(Application.class, args);
    }
}