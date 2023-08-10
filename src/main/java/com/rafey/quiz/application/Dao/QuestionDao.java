package com.rafey.quiz.application.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafey.quiz.application.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer>{ 

    List<Question>findByCategory(String category); // jpa will self infer that the user wants to fetch by column value
}
