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
    // this is the service layer which we will use to implement the business logic
    
}
