package com.profilematcherapp.profilematcher;

import com.profilematcherapp.profilematcher.entity.Person;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class ProfilematcherApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfilematcherApplication.class, args);
	}

//	// Bootstrap some test data into the in-memory database
//	@Bean
//	ApplicationRunner init(Person repository) {
//		return args -> {
//			Stream.of("Buy milk", "Eat pizza", "Write tutorial", "Study Vue.js", "Go kayaking").forEach(name -> {
//				Person person = new Person();
//				person.setName(name);
//				repository.save(person);
//			});
//			repository.findAll().forEach(System.out::println);
//		};
//	}

}
