package com.rafey.quiz.application.Service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rafey.quiz.application.Question;
import com.rafey.quiz.application.Dao.QuestionDao;

@Service
public class QuestionService {
    private static final Logger logger = LoggerFactory.getLogger(QuestionService.class);

    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionDao.findByCategory(category);
    }

    public ResponseEntity<List<Question>> getQuestionsByDifficulty(String difficulty) {
        try {
            List<Question> questions = questionDao.findByCategory(difficulty);
            return new ResponseEntity<>(questions, HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error occurred while fetching questions by difficulty: {}", e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    public ResponseEntity<String> addQuestion(Question question) {
        try {
            questionDao.save(question);
            return ResponseEntity.status(HttpStatus.CREATED).body("Successfully added the question");
        } catch (Exception e) {
            logger.error("Error occurred while adding a question: {}", e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to add the question");
        }
    }

    public ResponseEntity<String> deleteQuestion(Integer id) {
        try {
            boolean valid = questionDao.existsById(id);
            if (!valid) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Error: Cannot find question with id " + id);
            }
            questionDao.deleteById(id);
            return ResponseEntity.ok("Deleted question with id " + id);
        } catch (Exception e) {
            logger.error("Error occurred while deleting a question: {}", e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to delete the question");
        }
    }

    @Transactional
    public ResponseEntity<String> putQuestion(Integer id, String category, String difficulty) {
        try {
            if (!questionDao.existsById(id)) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Error: Cannot find question with id " + id);
            }

            Question question = questionDao.findById(id).orElse(null);
            if (question == null) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error: Unable to retrieve question with id " + id);
            }

            if (category != null && !category.isEmpty()) {
                question.setCategory(category);
            }

            if (difficulty != null && !difficulty.isEmpty()) {
                question.setDifficulty(difficulty);
            }

            return ResponseEntity.ok("Question with id " + id + " updated successfully");
        } catch (Exception e) {
            logger.error("Error occurred while updating a question: {}", e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to update the question");
        }
    }
}
