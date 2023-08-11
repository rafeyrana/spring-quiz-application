package com.rafey.quiz.application.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafey.quiz.application.Model.Quiz;

public interface QuizDao extends JpaRepository<Quiz,Integer>{
    
    
}
