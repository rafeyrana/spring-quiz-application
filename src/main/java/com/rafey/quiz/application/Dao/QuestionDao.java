package com.rafey.quiz.application.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rafey.quiz.application.Model.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

    List<Question> findByCategory(String category); // jpa will self infer that the user wants to fetch by column value

    List<Question> findByDifficulty(String difficulty); // jpa will self infer that the user wants to fetch by column
                                                        // value

    @Query(value = "SELECT * FROM questions q WHERE q.category = :category ORDER BY RANDOM() LIMIT :limit", nativeQuery = true)
    List<Question> getRandomQuestionsByCategory(String category, int limit);

}
