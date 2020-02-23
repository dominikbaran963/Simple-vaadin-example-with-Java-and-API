package pl.baran.vaadin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vaadin.flow.spring.annotation.EnableVaadin;
@EnableVaadin({"pl.baran.vaadin"})
@SpringBootApplication
public class VaadinApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaadinApplication.class, args);
	}

}
