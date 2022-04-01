/**
 * @author Ryan Juelsgaard - rjuelsgaard
 * CIS175 - Spring 2022
 * Mar 10, 2022
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Player;

@Configuration
public class PlayerBeanConfiguration {

	@Bean
	public Player player() {
		Player bean = new Player();
		return bean;
	}
}
