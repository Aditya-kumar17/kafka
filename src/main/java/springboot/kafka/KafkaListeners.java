package springboot.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "testKafka", groupId = "groupId")
    void listener(String data){
        System.out.println("Consuming Kafka messages"+ data + "😁");
    }
}
