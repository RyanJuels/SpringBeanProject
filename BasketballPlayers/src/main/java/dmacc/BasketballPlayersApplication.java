package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Player;
import dmacc.controller.PlayerBeanConfiguration;
import dmacc.repository.PlayerRepository;

@SpringBootApplication
public class BasketballPlayersApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(BasketballPlayersApplication.class, args);
		
	}
	@Autowired
	PlayerRepository repo;
	
	
	@Override
	public void run(String... args) throws Exception {
// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(PlayerBeanConfiguration.class);
//Using an existing bean
		Player c = appContext.getBean("player", Player.class);
		c.setJerseyNum(10);
		repo.save(c);
//Creating a bean to use – not managed by Spring
		Player d = new Player("Ryan", "Juelsgaard", 89, "Baseline");
		repo.save(d);
		List<Player> allMyContacts = repo.findAll();
		for (Player people : allMyContacts) {
			System.out.println(people.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}
}

