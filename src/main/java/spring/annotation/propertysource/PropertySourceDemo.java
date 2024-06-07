package spring.annotation.propertysource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;


@Component
public class PropertySourceDemo {

	@Autowired
	private Environment environment;
	
//	@Value("${spring.mail.host}")
	private String hostt;
	
//	@Value("${spring.mail.email}")
	private String emaill;
	
//	@Value("${spring.mail.password}")
	private String passwordd;

//	@Value("${app.name}")
	private String appName;
	
//	@Value("${app.description}")
	private String description;
	
	
	
	
	
	
	

	public String getAppName() {
		return environment.getProperty("app.name");
	}

	public String getDescription() {
		return environment.getProperty("app.description");
	}

	public String getHostt() {
		return environment.getProperty("spring.mail.host");
	}

	public String getEmaill() {
		return environment.getProperty("spring.mail.email");
	}

	public String getPasswordd() {
		return environment.getProperty("spring.mail.password");
	}
	
	


}
