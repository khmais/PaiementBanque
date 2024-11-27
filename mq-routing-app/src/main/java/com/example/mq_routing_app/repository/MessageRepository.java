package com.example.mq_routing_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mq_routing_app.model.Message;

public interface MessageRepository  extends JpaRepository<Message, Long>{

}
