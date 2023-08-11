package com.rafey.quiz.application.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rafey.quiz.application.Dao.QuestionDao;
import com.rafey.quiz.application.Dao.QuizDao;
import com.rafey.quiz.application.Model.Question;
import com.rafey.quiz.application.Model.Quiz;

@Service
public class QuizService {
    @Autowired
    QuizDao quizdao;
    @Autowired
    QuestionDao questionDao;

    public ResponseEntity<String> createQuiz(String category, Integer number_of_questions, String title) {
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        List<Question> questions = questionDao.getRandomQuestionsByCategory(category, number_of_questions);
        quiz.setQuestions(questions);
        System.out.println(quiz);
        quizdao.save(quiz);
        return new ResponseEntity<String>("success", HttpStatus.OK);
    }

    public List<Question> getQuiz(Integer id) {
        Optional<Quiz> quiz = quizdao.findById(id);
        if (quiz.isPresent()) {
            return quiz.get().getQuestions();
        }
        return new ArrayList<>(); // Return an empty list if quiz is not found
    }

}
