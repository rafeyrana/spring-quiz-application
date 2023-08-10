package com.rafey.quiz.application.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafey.quiz.application.Question;
import com.rafey.quiz.application.Dao.QuestionDao;

import jakarta.transaction.Transactional;

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
    public String deleteQuestion(Integer id) {
        boolean valid  = questionDao.existsById(id);
        if (!valid){
            return "Error cannot find id " + id;
        }
        questionDao.deleteById(id);
        return "Deleted question with id " + id;
    }
    @Transactional
    public String putQuestion(Integer id, String category, String difficulty) {
        if (!questionDao.existsById(id)) {
            return "Error: Cannot find question with id " + id;
        }

        Question question = questionDao.findById(id).orElse(null);
        if (question == null) {
            return "Error: Unable to retrieve question with id " + id;
        }

        if (category != null && !category.isEmpty()) {
            question.setCategory(category);
        }

        if (difficulty != null && !difficulty.isEmpty()) {
            question.setDifficulty(difficulty);
        }

        // questionDao.save(question);

        return "Question updated successfully";
    }
    

}
