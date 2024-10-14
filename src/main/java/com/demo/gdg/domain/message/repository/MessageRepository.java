package com.demo.gdg.domain.message.repository;

import com.demo.gdg.domain.message.model.Message;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface MessageRepository extends ReactiveMongoRepository<Message, Long> {
}
