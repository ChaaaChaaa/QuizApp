package com.example.geoquiz;

public class GradeQuiz {
    private static final int BASIC_SCORE = 1;
    private int score = 0;
    private int result = 0;

    public void setScore(int score) {
        this.score = score;
    }

    public void setResult(int result) {
        this.result = result;
    }

    int getScore(){
        score+=BASIC_SCORE;
        return score;
    }

    int averResult(int totalQustions){
        return (score/totalQustions)*100;
    }

}
