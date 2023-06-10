package pro.sky.coursework2.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.coursework2.model.Question;
import pro.sky.coursework2.service.QuestionService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceImplTest {
    @Mock
    private QuestionService questionService;
    @InjectMocks
    private ExaminerServiceImpl examinerService;
    @Test
    public void shouldReturnCollectionOfRandomQuestions() {
        //given
        Collection<Question> questions = new HashSet<>();
        questions.add(new Question("Map - это коллекция?", "Нет"));
        questions.add(new Question("List - это интерфейс или класс?", "Интерфейс"));
        questions.add(new Question("Возможно ли увелиение размера массива после его объявления?", "Нет"));
        questions.add(new Question("Какая наиболее распространенная реализация интерфейса Set?", "HashSet"));
        questions.add(new Question("В какой области памяти хранятся примитивы?", "В Stack"));

        ArrayList<Question> questionsList = new ArrayList<>(questions);

        given(questionService.getAll()).willReturn(questions);
        given(questionService.getRandomQuestion()).willReturn(
                questionsList.get(0),
                questionsList.get(0),
                questionsList.get(1),
                questionsList.get(1),
                questionsList.get(2),
                questionsList.get(2),
                questionsList.get(4),
                questionsList.get(4)
                );
        //when
        Collection<Question> actualRandomQuestions = examinerService.getQuestions(4);
        //then
        Assertions.assertEquals(new HashSet<>(List.of(
                questionsList.get(0),
                questionsList.get(1),
                questionsList.get(2),
                questionsList.get(4))),actualRandomQuestions);
    }
}
