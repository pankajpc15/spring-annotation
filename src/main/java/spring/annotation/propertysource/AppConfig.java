package spring.annotation.propertysource;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
//@PropertySource("classpath:mail.properties")
//@PropertySource("classpath:messsage.properties")

@PropertySources({
	
	
		@PropertySource("classpath:mail.properties"),
		@PropertySource("classpath:messsage.properties")
		
	}
)
public class AppConfig {

	
	
}
