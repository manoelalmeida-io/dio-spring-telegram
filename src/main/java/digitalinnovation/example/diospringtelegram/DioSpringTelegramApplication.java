package digitalinnovation.example.diospringtelegram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DioSpringTelegramApplication {

	public static void main(String[] args) {
		SpringApplication.run(DioSpringTelegramApplication.class, args);
	}

}
