package micro.config.server.git.microconfigservergit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


//http://localhost:8080/Station1/default

@SpringBootApplication
@EnableConfigServer
public class MicroConfigServerGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroConfigServerGitApplication.class, args);
	}
}
