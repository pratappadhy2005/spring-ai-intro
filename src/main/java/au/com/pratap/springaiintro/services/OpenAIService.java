package au.com.pratap.springaiintro.services;

import au.com.pratap.springaiintro.model.Answer;
import au.com.pratap.springaiintro.model.Question;

public interface OpenAIService {
    String getAnswer(String question);

    Answer getAnswer(Question question);
}
