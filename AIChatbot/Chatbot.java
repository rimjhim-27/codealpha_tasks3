// AI Chatbot Project --Chatbot.java
//This is part of AI Chatbot project
// Author: Rimjhim

import java.util.HashMap;

public class Chatbot {
    private HashMap<String, String> knowledgeBase;

    public Chatbot() {
        knowledgeBase = new HashMap<>();
        trainBot();
    }

    private void trainBot() {
        knowledgeBase.put("hi", "Hello! How can I help you today?");
        knowledgeBase.put("hello", "Hi there! What can I do for you?");
        knowledgeBase.put("how are you", "I'm a bot, but I'm functioning as expected!");
        knowledgeBase.put("what is your name", "I'm your friendly Java Chatbot.");
        knowledgeBase.put("bye", "Goodbye! Have a nice day!");
        knowledgeBase.put("help", "You can ask me about our services, working hours, or just say hello.");
        knowledgeBase.put("services", "We offer chatbot development, AI services, and IT support.");
        knowledgeBase.put("working hours", "We operate from 9 AM to 5 PM, Monday to Friday.");
    }

    public String getResponse(String input) {
        input = input.toLowerCase().trim();
        if (knowledgeBase.containsKey(input)) {
            return knowledgeBase.get(input);
        }
        return "I'm sorry, I don't understand that. Can you please rephrase?";
    }
}