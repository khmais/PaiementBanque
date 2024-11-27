package com.example.mq_routing_app.controller;

 
import com.example.mq_routing_app.dto.MessageDTO;
import com.example.mq_routing_app.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping
    public List<MessageDTO> getMessages() {
        return messageService.getAllMessages();
    }

    @GetMapping("/{id}")
    public MessageDTO getMessage(@PathVariable Long id) {
        return messageService.getMessageById(id);
    }
}
