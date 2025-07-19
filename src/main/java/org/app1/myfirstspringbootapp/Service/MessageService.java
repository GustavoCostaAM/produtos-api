package org.app1.myfirstspringbootapp.Service;

import org.app1.myfirstspringbootapp.Repository.MessageRepository;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository){
        this.messageRepository = messageRepository;
    }

    public String getMessage(){
        return messageRepository.Message();
    }
}
