package org.example.controlleres;

import org.example.service.ChatBotService;

public class ChatBotController {
    private final ChatBotService chatBotService = new ChatBotService();
    public String completeTask(String input, Integer clientId){
        return chatBotService.completeTask(input, clientId);
    }
}
