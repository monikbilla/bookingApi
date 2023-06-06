package com.sentryc.bookingapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sentryc.bookingapi.entity.Transaction;
import com.sentryc.bookingapi.repository.TransRepo;


@SpringBootApplication
public class BookingapiApplication implements CommandLineRunner{
	@Autowired 
    TransRepo transRepo;
	public static void main(String[] args)  {
		SpringApplication.run(BookingapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Transaction one = new Transaction();
		one.setAmount(300.50);
		one.setCurrency("USD");
		one.setParent_id(4);
		one.setType("CASH");
		transRepo.save(one);
		Transaction two = new Transaction();
		two.setAmount(300.50);
		two.setCurrency("INR");
		two.setParent_id(4);
		two.setType("CASH");
		transRepo.save(two);
		Transaction three=  new Transaction();
		three.setAmount(200.50);
		three.setCurrency("USD");
		three.setParent_id(2);
		three.setType("Credit");
		transRepo.save(three);
		Transaction four = new Transaction();
		four.setAmount(400.50);
		four.setCurrency("EUR");
		four.setParent_id(2);
		four.setType("Credit");
		transRepo.save(four);
		
	}

}
