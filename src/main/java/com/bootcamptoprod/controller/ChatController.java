package com.bootcamptoprod.controller;

import dev.langchain4j.model.chat.ChatModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class ChatController {

    private final ChatModel chatModel;

    public ChatController(ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    @PostMapping("/chat")
    public ResponseEntity<Map<String, Object>> simpleChat(@RequestBody Map<String, String> request) {

        // Extract user message from request body
        String userMessage = request.get("message");

        // Send prompt to LM Studio model
        String response = chatModel.chat(userMessage);

        // Prepare simple JSON response
        Map<String, Object> result = new LinkedHashMap<>();
        result.put("aiResponse", response);

        return ResponseEntity.ok(result);
    }
}