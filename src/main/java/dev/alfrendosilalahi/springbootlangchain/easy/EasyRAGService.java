package dev.alfrendosilalahi.springbootlangchain.easy;

import dev.alfrendosilalahi.springbootlangchain.easy.util.EasyRAGAssistant;
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
