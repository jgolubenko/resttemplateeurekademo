package demo.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class HelloWorldController {

	//@LoadBalanced
	@Autowired
	RestTemplate client;
	
	@RequestMapping("/")
	public String hello() {
		return "Hello, World!";
	}

	@RequestMapping("/date")
	public String date() {
		return "It is "+client.getForObject("http://date-service/", String.class);
	}

}
