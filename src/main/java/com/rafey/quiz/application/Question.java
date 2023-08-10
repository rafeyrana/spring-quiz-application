package com.rafey.quiz.application;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String category;
    private String difficulty;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String questionTitle;
    private String correctOption;

    // Constructors
    public Question() {
    }

    public Question(String category, String difficulty, String option1, String option2, String option3, String option4, String questionTitle, String correctOption) {
        this.category = category;
        this.difficulty = difficulty;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.questionTitle = questionTitle;
        this.correctOption = correctOption;
    }
}