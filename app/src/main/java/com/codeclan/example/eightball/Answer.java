package com.codeclan.example.eightball;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 23/02/2017.
 */

public class Answer implements Answerable {
    private Answer spyAnswer;
    private ArrayList<String> answers;

    public Answer(String yes, String no, String maybe){
        answers = new ArrayList<String>();
    }

    public Answer(ArrayList<String> answers){
    this.answers = new ArrayList<String>(answers);
    }

    public ArrayList<String> getAnswers(){
        return new ArrayList<String>(answers);
    }

    public int getLength(){
        return answers.size();
    }

    public String getAnswerAtIndex(int index){
        return answers.get(index);
    }

    public String getAnswer() {

        Random rand = new Random();
        int listSize = getLength();
        int index = rand.nextInt(listSize);
        String answer = getAnswerAtIndex(index);
    return answer;
    }
}


