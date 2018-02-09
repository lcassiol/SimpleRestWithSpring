package com.lcassiol.SimpleBackend.controller;

import com.lcassiol.SimpleBackend.entities.Message;
import com.lcassiol.SimpleBackend.repository.IMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    IMessageRepository messageRepository;

    @RequestMapping(method = RequestMethod.GET, path = "/message",  produces = "application/json")
    public @ResponseBody
    List<Message> listAll(){
        return messageRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, path = "/message",  produces = "application/json")
    @ResponseStatus(value = HttpStatus.OK)
    public void createMessage(@RequestBody Message message){
        messageRepository.save(message);
    }

}
