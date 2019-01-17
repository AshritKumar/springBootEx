package practice.springBootEx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Specifies that thi is a spring boot app.
@SpringBootApplication
public class SpringAppStarter {
	
	public static void main(String[] args) {
		// starts the servlet container and 
		SpringApplication.run(SpringAppStarter.class, args);
		
	}

}
