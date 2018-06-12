package com.patterns.bridge;

public class BridgePatternDemo {
    public static void main(String[] args) {
        QuestionFormat questions = new QuestionFormat("Popculture persions");

        questions.q  = new JavaQuestions();
        questions.delete("What is swordsman?");
        questions.displayQuestion();
        questions.newOne("Who is ninja");
        questions.newOne("Who is Doctor Strange?");
        questions.displayAll();
    }
}
