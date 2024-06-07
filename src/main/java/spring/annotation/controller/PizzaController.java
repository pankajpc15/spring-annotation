package spring.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.annotation.service.Pizza;


//@Component("pizzaDemo") // cutomized bean name ("pizzademo")
public class PizzaController {

//	//filed injection
//	@Autowired
	private Pizza pizza;

	// constructor injection
	//qualifier
//	@Autowired
	public PizzaController( Pizza pizza) {
		this.pizza=pizza;
	}

	// setter injection

//	@Autowired
//	public void setVegPizza(VegPizza vegPizza) {
//		this.vegPizza = vegPizza;
//	}

//	public String getPizaa() {
//		return vegPizza.getPizza();
//	}
	public String getPizaa() {
		return pizza.getPizaa();
	}
public void init() {

	System.out.println("initilization logic");
}
public void destory() {
	System.out.println("Destruction logic");
}
}
