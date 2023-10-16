Create Topic:

```bin/kafka-topics.sh --create --topic testKafka --bootstrap-server localhost:9092```

Test Producer:
```bin/kafka-console-producer.sh --topic testKafka --bootstrap-server localhost:9092```

Test Consumer:
```bin/kafka-console-consumer.sh --topic testKafka --from-beginning --bootstrap-server localhost:9092```


https://kafka.apache.org/quickstart 