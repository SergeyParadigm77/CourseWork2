package pro.sky.coursework2.service.impl;
import org.springframework.stereotype.Service;
import pro.sky.coursework2.exceptions.QuestionNotFoundException;
import pro.sky.coursework2.repository.Question;
import pro.sky.coursework2.service.QuestionService;

import java.util.*;
@Service
public class QuestionServiceImpl implements QuestionService {

    private final Collection<Question> questions = new HashSet<>();

    @Override
    public Question add(String question, String answer) {
        Question questionAnswer = new Question(question, answer);
        questions.add(questionAnswer);
        return questionAnswer;
    }

    @Override
    public Question add(Question question) {
        questions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        if(questions.contains(question)) {
            questions.remove(question);
            return question;
        }
        else{
            throw new QuestionNotFoundException();
        }
    }

    @Override
    public Collection<Question> getAll() {
        return Collections.unmodifiableCollection(questions);
    }

    @Override
    public Question getRandomQuestion() {
        return null;
    }
}
