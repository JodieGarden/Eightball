package com.codeclan.example.eightball;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

/**
 * Created by user on 23/02/2017.
 */

public class AnswerTest {
   ArrayList<String> testAnswers;
    private Answer answers;

    @Before
    public void before() {
        testAnswers = new ArrayList<String>();
        testAnswers.add("Yes");
        testAnswers.add("No");
        testAnswers.add("Yer Maw");


        answers = new Answer(testAnswers);

    }

    @Test
    public void testGetLength(){
    assertEquals(3, answers.getAnswers().size());
    }

    @Test
    public void testGetAnswer(){
        assertEquals("Yes", answers.getAnswerAtIndex(0));
    }

    @Test
    public void testGetRandomAnswer(){
        assertTrue(testAnswers.contains(answers.getAnswer()));
    }


}