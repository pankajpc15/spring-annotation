package spring.annotation.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
public class VegPizza implements Pizza {
	
	
	

	@Override
	public String getPizaa() {
		return "veg pizza";
	}

	

}
