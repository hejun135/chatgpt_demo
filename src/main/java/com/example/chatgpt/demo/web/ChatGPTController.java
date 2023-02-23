package com.example.chatgpt.demo.web;

import com.example.chatgpt.demo.service.ChatGPTService;
import com.theokanning.openai.completion.CompletionChoice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ChatGPTController {
    @Resource
    private ChatGPTService service;
    @GetMapping("/chatgpt")
    public List<CompletionChoice> chatgpt(String context){
        return service.chatgpt(context);
    }
}
