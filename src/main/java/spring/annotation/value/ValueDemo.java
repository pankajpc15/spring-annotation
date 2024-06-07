package spring.annotation.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueDemo {
	
	@Value("Default Name")
	private String defaultName;
	
	@Value("${spring.mail.host}")
	private String host;
	
	@Value("${spring.mail.email}")
	private String email;
	
	@Value("${spring.mail.password}")
	private String password;
	
	@Value("${java.home}")
	private String javaHome;
	
	@Value("${path}")
	private String homeDir;
	
	
	
	

	public String getJavaHome() {
		return javaHome;
	}








	public String getHomeDir() {
		return homeDir;
	}








	public String getHost() {
		return host;
	}




	


	public String getEmail() {
		return email;
	}








	public String getPassword() {
		return password;
	}




	



	public String getDefaultName() {
		return defaultName;
	}

	

	
}
