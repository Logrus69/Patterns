import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApplicationProperties {

    @Value("${log.root.dir:logs}")
    private String logRootDir;


    public String getLogRootDir() {
        return logRootDir;
    }
}
