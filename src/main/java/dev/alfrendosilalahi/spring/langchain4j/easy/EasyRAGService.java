package dev.alfrendosilalahi.spring.langchain4j.easy;

import dev.alfrendosilalahi.spring.langchain4j.easy.util.EasyRAGAssistant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EasyRAGService {

    private final EasyRAGAssistant easyRAGAssistant;

    public String startConversation(PromptRequestDTO promptRequestDTO) {
        return easyRAGAssistant.answer(promptRequestDTO.getPrompt());
    }

}
