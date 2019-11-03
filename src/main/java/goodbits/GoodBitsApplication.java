package goodbits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackages="model")
@ComponentScan(basePackages= {"goodbits."})
@EnableJpaRepositories(basePackages= {"goodbits.repository*"})
@EnableTransactionManagement

public class GoodBitsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoodBitsApplication.class, args);
	}
}
