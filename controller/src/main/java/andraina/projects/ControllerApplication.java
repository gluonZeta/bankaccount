package andraina.projects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(ReposirotyConfig.class)
public class ControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControllerApplication.class, args);
	}

}
