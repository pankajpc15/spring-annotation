package spring.annotation.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component 
////("nonVegPizza")
//@Primary
public class NonVegPizaa implements Pizza {

	@Override
	public String getPizaa() {
		
		return "nonvegpizaa";
	}

}
