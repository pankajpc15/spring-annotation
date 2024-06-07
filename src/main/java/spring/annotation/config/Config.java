package spring.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import spring.annotation.controller.PizzaController;
import spring.annotation.service.NonVegPizaa;
import spring.annotation.service.Pizza;
import spring.annotation.service.VegPizza;

@Configuration
public class Config {

	@Bean(name = "vegPizzaBean")
	public Pizza vegPizza() {
		
		return new VegPizza();
	}
	@Bean
	public Pizza nonVegPizza() {
		return new NonVegPizaa();
	}
	@Bean(initMethod = "init",destroyMethod = "destory")
	public PizzaController  pizzaController() {
		return new PizzaController(vegPizza());
	}
}
