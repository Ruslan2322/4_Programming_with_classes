package Lesson_04_Simple_classes_and_obj.Ex_6;

public class TimerSet {

    public int hours;
    public int minutes;
    public int seconds;

    TimerSet(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    int getHours() {
        if (hours > 24 || hours < 0)
            hours = 0;
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    int getMinutes() {
        if (minutes > 60 || minutes < 0)
            minutes = 0;
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    int getSeconds() {
        if (seconds > 60 || seconds < 0)
            seconds = 0;
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return "TimerSet" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds;
    }
}