package org.example.com.bridgelabz.mood_analyser;

public class MoodAnalyser {
    String message;
    public MoodAnalyser(String message){
        this.message = message;
    }
    public String analyseMood(String message){
        this.message = message;
        return analyseMood();
    }
    public String analyseMood() {
        if (message.contains("Sad")){
            return "SAD";
        }else {
            return "HAPPY";
        }

    }
}
