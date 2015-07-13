package com.mycompany.jerseymvcexam;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.ejb.Singleton;


@Singleton
public class BoardEJB {
    private final List<Message> messageQueue;

    public BoardEJB() {
        this.messageQueue = java.util.Collections.synchronizedList(new LinkedList<>());
    }
    
    public void addMessage(String name, String comment) {
        messageQueue.add(new Message(new Date(), name, comment));
        while(messageQueue.size() > 25) {
            messageQueue.remove(0);
        }
    }
    
    public Message[] getCurrentMessage() {
        return messageQueue.toArray(new Message[0]);
    }
}
