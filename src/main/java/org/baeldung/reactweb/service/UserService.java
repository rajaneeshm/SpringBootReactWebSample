package org.baeldung.reactweb.service;

import java.time.Duration;
import java.util.Random;
import java.util.stream.Stream;

import org.baeldung.reactweb.model.User;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.util.function.Tuple2;

@Service
public class UserService {
	

	public Flux<User> getUserDetails() {
		 Flux<Long> interval = Flux.interval(Duration.ofSeconds(1));
	      
	        Flux<User> Users = Flux.fromStream(Stream.generate(() -> new User("User"+getRandomId().toString(),getRandomId().toString())));
	        
	        return Flux.zip(interval, Users).map(Tuple2::getT2);
	}
	
	private Integer getRandomId(){
		
		Random random = new Random();
		
		return random.nextInt(10000);
	}

}
