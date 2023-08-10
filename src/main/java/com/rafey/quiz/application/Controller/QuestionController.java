package com.rafey.quiz.application.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.rafey.quiz.application.Question;
import com.rafey.quiz.application.Service.QuestionService;

@RestController
@RequestMapping("question")
public class QuestionController { // this is only for a single question
    @Autowired
    QuestionService questionService;
    
    @GetMapping("/allQuestions")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }
    @GetMapping("/category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable String category){
        return questionService.getQuestionsByCategory(category);
    }
    @GetMapping("/difficulty/{difficulty}")
    public List<Question> getQuestionsByDifficulty(@PathVariable String difficulty){
        return questionService.getQuestionsByCategory(difficulty);
    }
    @PostMapping("add")
    public String addQuestion(@RequestBody Question question){
       return  questionService.addQuestion(question);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteQuestion(@PathVariable Integer id){
        return questionService.deleteQuestion(id);
    }
    
}
