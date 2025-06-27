// AI Chatbot Project --ChatbotGUI.java
//This is part of AI Chatbot project
// Author: Rimjhim

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatbotGUI extends JFrame implements ActionListener {
    private JTextArea chatArea;
    private JTextField inputField;
    private JButton sendButton;
    private Chatbot chatbot;

    public ChatbotGUI() {
        chatbot = new Chatbot();
        setTitle("Java AI Chatbot");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setLineWrap(true);
        add(new JScrollPane(chatArea), BorderLayout.CENTER);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());

        inputField = new JTextField();
        sendButton = new JButton("Send");
        sendButton.addActionListener(this);

        inputPanel.add(inputField, BorderLayout.CENTER);
        inputPanel.add(sendButton, BorderLayout.EAST);
        add(inputPanel, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String userText = inputField.getText();
        if (!userText.isEmpty()) {
            chatArea.append("You: " + userText + "\n");
            String response = chatbot.getResponse(userText);
            chatArea.append("Bot: " + response + "\n\n");
            inputField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ChatbotGUI gui = new ChatbotGUI();
            gui.setVisible(true);
        });
    }
}