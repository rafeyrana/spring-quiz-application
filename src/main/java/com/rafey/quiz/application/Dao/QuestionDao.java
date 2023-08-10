package com.rafey.quiz.application.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafey.quiz.application.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer>{ 

    
}
