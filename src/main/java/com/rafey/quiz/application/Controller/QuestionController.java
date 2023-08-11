package com.rafey.quiz.application.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.rafey.quiz.application.Question;
import com.rafey.quiz.application.Service.QuestionService;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping("/allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions() {
        List<Question> questions = questionService.getAllQuestions();
        return ResponseEntity.ok(questions);
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category) {
        List<Question> questions = questionService.getQuestionsByCategory(category);
        return ResponseEntity.ok(questions);
    }

    @GetMapping("/difficulty/{difficulty}")
    public ResponseEntity<List<Question>> getQuestionsByDifficulty(@PathVariable String difficulty) {
        ResponseEntity<List<Question>> response = questionService.getQuestionsByDifficulty(difficulty);
        return response;
    }

    @PostMapping("/add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question) {
        System.out.println("this has been accessed");
        ResponseEntity<String> response = questionService.addQuestion(question);
        return response;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteQuestion(@PathVariable Integer id) {
        ResponseEntity<String> response = questionService.deleteQuestion(id);
        return response;
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<String> putQuestion(
            @PathVariable Integer id,
            @RequestParam(required = false) String category,
            @RequestParam(required = false) String difficulty) {
        ResponseEntity<String> response = questionService.putQuestion(id, category, difficulty);
        return response;
    }
}
 