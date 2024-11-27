package com.example.mq_routing_app.service;

import com.example.mq_routing_app.dto.MessageDTO;
import com.example.mq_routing_app.model.Message;
import com.example.mq_routing_app.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public List<MessageDTO> getAllMessages() {
        List<Message> messages = messageRepository.findAll();
        return messages.stream().map(message -> {
            MessageDTO dto = new MessageDTO();
            dto.setId(message.getId());
            dto.setContent(message.getContent());
            dto.setTimestamp(message.getTimestamp());
            return dto;
        }).collect(Collectors.toList());
    }

    public MessageDTO getMessageById(Long id) {
        Message message = messageRepository.findById(id).orElse(null);
        if (message == null) return null;
        MessageDTO dto = new MessageDTO();
        dto.setId(message.getId());
        dto.setContent(message.getContent());
        dto.setTimestamp(message.getTimestamp());
        return dto;
    }
}
