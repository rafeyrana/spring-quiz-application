package com.rafey.quiz.application.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafey.quiz.application.Question;
import com.rafey.quiz.application.Dao.QuestionDao;

@Service 
public class QuestionService {
    @Autowired
    QuestionDao questionDao;
    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }
    public List<Question> getQuestionsByCategory(String category) {
        return questionDao.findByCategory(category);
    }
    public List<Question> getQuestionsByDifficulty(String difficulty) {
        return questionDao.findByCategory(difficulty);
    }
    public String addQuestion(Question question) {
        questionDao.save(question);
        return "Successfully added the question";
    }

}
