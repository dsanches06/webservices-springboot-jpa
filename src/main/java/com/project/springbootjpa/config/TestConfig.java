package com.project.springbootjpa.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.project.springbootjpa.entities.Order;
import com.project.springbootjpa.entities.User;
import com.project.springbootjpa.entities.enums.OrderStatus;
import com.project.springbootjpa.repositories.OrderRepository;
import com.project.springbootjpa.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {

		// user
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		User u3 = new User(null, "Danilson Sanches", "dsanches@gmail", "123456789", "teste123");

		// order
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.SHIPPED, u1);
		Order o4 = new Order(null, Instant.parse("2020-03-12T15:21:22Z"), OrderStatus.DELIVERED, u3);

		// salvar na tabela user
		userRepository.saveAll(Arrays.asList(u1, u2, u3));

		// salvar na tabela order
		orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4));

	}
}
