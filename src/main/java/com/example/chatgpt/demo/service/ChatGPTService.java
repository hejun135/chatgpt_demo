package com.example.chatgpt.demo.service;

import com.theokanning.openai.completion.CompletionChoice;
import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatGPTService {
    //自行替换open ai的API-KEY
    OpenAiService service = new OpenAiService("API-KEY");
    public List<CompletionChoice> chatgpt(String context){
        CompletionRequest completionRequest = CompletionRequest.builder()
                .prompt(context)
                .model("text-davinci-003")
                .temperature(0.5)
                .maxTokens(2048)
                .topP(1D)
                .frequencyPenalty(0D)
                .presencePenalty(0D)
                .echo(true)
                .build();
        return service.createCompletion(completionRequest).getChoices();
    }

}
