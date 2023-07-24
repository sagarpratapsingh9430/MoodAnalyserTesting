package com.bridgelabz.mood_analyser_testing;

import org.example.com.bridgelabz.exceptions.MoodAnalysisException;
import org.example.com.bridgelabz.mood_analyser.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTesting {
    @Test
    public void givenSadMood_WhenProper_ShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals("SAD",mood);
    }
    @Test
    public void givenHappyMood_WhenProper_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals("HAPPY",mood);
    }
    @Test
    public void givenNullMoodShouldThrowException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);

        try {
         moodAnalyser.analyseMood();

        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL,e.type);

        }

    }

    @Test
    public void givenEmptyMoodShouldThrowException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);

        try {
            moodAnalyser.analyseMood();

        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,e.type);

        }

    }

}
