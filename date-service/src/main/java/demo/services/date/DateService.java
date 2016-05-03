package demo.services.date;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateService {

	@RequestMapping("/")
	public String date() {
		return new Date().toString();
	}	
	
}
