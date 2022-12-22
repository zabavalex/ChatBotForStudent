package org.example;

import org.example.controlleres.ChatBotController;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ChatBotController botController = new ChatBotController();
        System.out.println(botController.completeTask("1", 1));
        System.out.println(botController.completeTask("1", 1));
        System.out.println(botController.completeTask("1", 1));
        System.out.println(botController.completeTask("1", 1));
    }
}