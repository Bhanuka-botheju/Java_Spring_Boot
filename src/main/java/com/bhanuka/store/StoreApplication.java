package com.bhanuka.store;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bhanuka.store.entities.Address;
import com.bhanuka.store.entities.User;

@SpringBootApplication
public class StoreApplication {
 
	public static void main(String[] args) {
		var user = User.builder()
			.id(2L)
			.name("bhanuka3")
			.email("bhanuka@gmail.com")
			.password("bhanuka123")
			.build();


		var addresses = Address.builder()
			.street("street")
			.city("city")
			.state("state")
			.zip("1524")
			.build();

		user.addAddress(addresses);
		System.out.println(user);
	}

}

