package ru.gamespring.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.gamespring.springboottest.service.Game;

@SpringBootApplication
public class SpringBootTestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootTestApplication.class, args);
		Game game = context.getBean(Game.class);
		game.start();

	}

}
