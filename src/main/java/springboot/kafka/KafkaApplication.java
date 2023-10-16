package springboot.kafka;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext =  SpringApplication.run(KafkaApplication.class, args);
		ApplicationContext ApplicationContext =  SpringApplication.run(KafkaApplication.class, args);
	}

	/**
	 * 
	 * @param kafkaTemplate This is injected in this method via Method Injection
	 * @return
	 */
	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate){
		return args ->{
			// kafkaTemplate.send("testKafka", "Hello Kafka");
			for (int i = 0; i < 100; i++) {
				kafkaTemplate.send( "testKafka", "Testing producer: "+i);
				
			}
		};
	}

	

}
