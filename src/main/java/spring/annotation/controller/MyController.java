package spring.annotation.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	public String hello() {
		return "hello controller";
	}
}
