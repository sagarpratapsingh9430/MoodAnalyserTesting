package com.bridgelabz.mood_analyser_testing;

import org.example.com.bridgelabz.mood_analyser.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTesting {
    @Test
    public void givenSadMood_WhenProper_ShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD",mood);
    }
    @Test
    public void givenHappyMood_WhenProper_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }
    @Test
    public void givenNullMood_WhenProper_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }

}
