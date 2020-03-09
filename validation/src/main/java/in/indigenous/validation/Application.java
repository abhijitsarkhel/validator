package in.indigenous.validation;

import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.indigenous.validation.model.RequestParams;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private Validator validator;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		RequestParams params = new RequestParams().withVersion("v1.0").withSource("PSC");
		validator.validate(params);
	}

}
