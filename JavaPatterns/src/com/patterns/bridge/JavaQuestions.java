package com.patterns.bridge;

import java.util.ArrayList;
import java.util.List;

public class JavaQuestions implements Question {

    private List<String> questions = new ArrayList<>();
    private int current = 0;

    public JavaQuestions() {
        questions.add("What is tank?");
        questions.add("What is witcher?");
        questions.add("What is swordsman?");
        questions.add("What is tower?");
        questions.add("What is Browning?");
        questions.add("What is Predator?");
        questions.add("What is Mage?");

    }
    @Override
    public void nextQuestion() {
        if (current <= questions.size() - 1){
            current++;
            System.out.println(current);
        }
    }

    @Override
    public void previousQuestion() {
        if (current > 0) {
            current--;
        }
    }

    @Override
    public void newQuestion(String q) {
        questions.add(q);
    }

    @Override
    public void deleteQuestion(String q) {
        questions.remove(q);
    }

    @Override
    public void displayQuestion() {
        System.out.println(questions.get(current));
    }

    @Override
    public void displayAllQuestions() {
        questions.forEach(System.out::println);
    }
}
