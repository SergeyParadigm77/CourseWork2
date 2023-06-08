package pro.sky.coursework2.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.coursework2.repository.Question;
import pro.sky.coursework2.service.QuestionService;

import java.util.Collection;

@RestController
@RequestMapping("/java")
public class QuestionController {

private final QuestionService questionService;
public QuestionController(QuestionService questionService) {
    this.questionService = questionService;
}
@GetMapping("/add")
    public Question addQuestion(@RequestParam String question, @RequestParam String answer) {
    return (questionService.add(question, answer));
}
@GetMapping("/remove")
    public Collection<Question> remove(@RequestParam Question question) {
    questionService.remove(question);
    return null;
}
@GetMapping("/")
    public Collection<Question> getAllQuestions() {
    return questionService.getAll();
    }
}
