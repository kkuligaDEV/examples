package com.patterns.bridge;

public class QuestionManager {
    protected Question q; //acts as a bridge ?

    public String catalog;

    public QuestionManager(String catalog) {
        this.catalog = catalog;
    }

    public void next() {
        q.nextQuestion();
    }

    public void previous() {
        q.previousQuestion();
    }

    public void newOne(String s) {
        q.newQuestion(s);
    }

    public void delete(String quest) {
        q.deleteQuestion(quest);
    }

    public void displayQuestion() {
        q.displayQuestion();
    }

    public void displayAll() {
        System.out.println("Question paper: "+catalog);
        q.displayAllQuestions();
    }

}
