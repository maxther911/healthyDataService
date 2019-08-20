package net.mrsistemas.healthy.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = {"net.mrsistemas.healthy"})
@EnableMongoRepositories(basePackages = "net.mrsistemas.healthy.data.business.repository")
public class HealthyDataServiceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(HealthyDataServiceApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return super.configure(builder.sources(HealthyDataServiceApplication.class));
	}
}
