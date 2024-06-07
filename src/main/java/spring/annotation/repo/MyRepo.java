package spring.annotation.repo;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepo {
	
	public String hello() {
		return "hello repo";
	}

}
