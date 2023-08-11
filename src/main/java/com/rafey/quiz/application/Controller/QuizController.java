package com.rafey.quiz.application.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.rafey.quiz.application.Service.QuizService;
import com.rafey.quiz.application.Model.*;

@RestController
@RequestMapping("quiz")
public class QuizController {
    @Autowired
    QuizService quizService;

    @PostMapping("create")
    public ResponseEntity<String> createQuiz(
            @RequestParam String category,
            @RequestParam Integer number_of_questions,
            @RequestParam String title) {
        ResponseEntity<String> response = quizService.createQuiz(category, number_of_questions, title);
        return new ResponseEntity<>(response.getBody(), response.getHeaders(), response.getStatusCode());
    }

    @GetMapping("/get/{id}") 
    public ResponseEntity<List<Question>> getQuiz(@PathVariable Integer id) {
        List<Question> questions = quizService.getQuiz(id);
        return new ResponseEntity<>(questions, HttpStatus.OK);
    }

}
