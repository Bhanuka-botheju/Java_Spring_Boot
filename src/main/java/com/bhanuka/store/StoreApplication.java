package com.bhanuka.store;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bhanuka.store.entities.User;

@SpringBootApplication
public class StoreApplication {
 
	public static void main(String[] args) {
		var user = new User();
		user.setName("bhanuka");
		user.setEmail("bhanuka@gmail.com");
		user.setPassword("bhanuka123");

		var user2 = new User(1L,"bhanuka2","bhanuka2@gmail.com","prabath2");

		var user3 = User.builder()
			.id(2L)
			.name("bhanuka3")
			.email("bhanuka@gmail.com")
			.password("bhanuka123")
			.build();
	}

}

