package pro.sky.coursework2.service;
import pro.sky.coursework2.repository.Question;
import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
