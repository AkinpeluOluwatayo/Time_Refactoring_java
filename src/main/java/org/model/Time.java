package main.java.org.model;

public class Time {
    private int hour;
    private int minutes;
    private int seconds;


    private void setTime(int hour, int minutes, int seconds) {
        validate(hour);
        validateMinutes(minutes);
        validateSeconds(seconds);

        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;

    }

    private static void validateSeconds(int seconds) {
        if(seconds < 0 || seconds >= 60)throw new IllegalArgumentException("seconds is out of range");
    }

    private static void validateMinutes(int minutes) {
        if(minutes < 0 || minutes >= 60)throw new IllegalArgumentException("minutes is out of range");
    }

    private static void validate(int hour) {
        if(hour < 0 || hour >= 24) throw new IllegalArgumentException("hour is out of range");
    }
}
