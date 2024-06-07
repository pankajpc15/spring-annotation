package spring.annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import spring.annotation.controller.MyController;
import spring.annotation.controller.PizzaController;
import spring.annotation.lazy.LazyLoader;
import spring.annotation.propertysource.PropertySourceDemo;
import spring.annotation.repo.MyRepo;
import spring.annotation.scope.PrototypeBean;
import spring.annotation.scope.SingletonBean;
import spring.annotation.service.MyService;
import spring.annotation.service.VegPizza;
import spring.annotation.value.ValueDemo;

@SpringBootApplication
public class SpringAnnotationsApplication {
 
	public static void main(String[] args) {
	var context=SpringApplication.run(SpringAnnotationsApplication.class, args);
// 	PizzaController pizzaController = context.getBean(PizzaController.class);
//	PizzaController pizzaController = (PizzaController) context.getBean("pizzaController");
	//@comopnent
//System.out.println(pizzaController.getPizaa());


//MyController myController = context.getBean(MyController.class);
//System.out.println(myController.hello());
//
//MyService myService = context.getBean(MyService.class);
//System.out.println(myService.hello());
//
//MyRepo myRepo = context.getBean(MyRepo.class);
//System.out.println(myRepo.hello());
//
//LazyLoader lazyLoader = context.getBean(LazyLoader.class);
//

	
//	VegPizza vegPizza = context.getBean(VegPizza.class);
//VegPizza vegPizza = (VegPizza) context.getBean("vegPizzaBean"); 	
//System.out.println(vegPizza.getPizaa());
	
//	SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
//	System.out.println(singletonBean1.hashCode());
//	SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
//	System.out.println(singletonBean2.hashCode());
//	SingletonBean singletonBean3 = context.getBean(SingletonBean.class);
//	System.out.println(singletonBean3.hashCode());
//
//	PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
//	System.out.println(prototypeBean1.hashCode());
//	PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
//	System.out.println(prototypeBean2.hashCode());
//	PrototypeBean prototypeBean3 = context.getBean(PrototypeBean.class);
//	System.out.println(prototypeBean3.hashCode());
	
//	
//	ValueDemo valueDemo = context.getBean(ValueDemo.class);
//	System.out.println(valueDemo.getDefaultName());
	
//	System.out.println(valueDemo.getDefaultName());
//	System.out.println(valueDemo.getHost());
//	System.out.println(valueDemo.getEmail());
//	System.out.println(valueDemo.getPassword());
//	
//	System.out.println(valueDemo.getJavaHome());
//	System.out.println(valueDemo.getHomeDir());
//	
	PropertySourceDemo propertySourceDemo = context.getBean(PropertySourceDemo.class);
	System.out.println(propertySourceDemo.getHostt());
	System.out.println(propertySourceDemo.getEmaill());
	System.out.println(propertySourceDemo.getPasswordd());
	
	System.out.println(propertySourceDemo.getAppName());
	System.out. println(propertySourceDemo.getDescription());
	
	
	
	
	
	
	}

}
 