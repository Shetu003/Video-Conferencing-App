package com.shetu.videocall;

import com.shetu.videocall.user.User;
import com.shetu.videocall.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(UserService service) {
		return args -> {
			User user1 = new User();
			user1.setUsername("Shetu");
			user1.setEmail("srivastavashetu@gmail.com");
			user1.setPassword("MomDad@2004");

			User user2 = new User();
			user2.setUsername("Sohin");
			user2.setEmail("sohinnaaz@gmail.com");
			user2.setPassword("MomDad@2004");

			service.register(user1);
			service.register(user2);
		};
	}


}
