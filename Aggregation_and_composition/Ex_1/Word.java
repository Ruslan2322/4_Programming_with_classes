package Lesson_04_Aggregation_composition.Ex_1;

public class Word {
    private String word;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Word(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return word;
    }
}

