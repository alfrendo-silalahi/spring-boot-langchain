package dev.alfrendosilalahi.spring.langchain4j.easy;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rag/easy")
@RequiredArgsConstructor
public class EasyRAGController {

    private final EasyRAGService easyRAGService;

    @PostMapping("/conversation")
    public String startConversation(@RequestBody PromptRequestDTO promptRequestDTO) {
        return easyRAGService.startConversation(promptRequestDTO);
    }

}
