package demo.services.date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DateServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DateServiceApplication.class, args);
    }
}
