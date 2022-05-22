package springstudy.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import springstudy.spring.util.PropertiesConfig;

import javax.annotation.PostConstruct;

@EnableConfigurationProperties({PropertiesConfig.class})
@SpringBootApplication
@Slf4j
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@PostConstruct
	public void ansiLog() {
		log.error("error log");
		log.info("info log");
		log.warn("warn log");
		log.trace("trace log");
	}
}
