package pro.sky.coursework2.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.coursework2.repository.Question;
import pro.sky.coursework2.service.ExaminerService;
import pro.sky.coursework2.service.QuestionService;

import java.util.Collection;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        return null;
    }
}
