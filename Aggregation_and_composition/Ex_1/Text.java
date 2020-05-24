package Lesson_04_Aggregation_composition.Ex_1;
import java.util.ArrayList;


public class Text {

    private Word headline;
    private ArrayList<Sentence> content;

    public Text(Word headline, ArrayList<Sentence> content) {
        this.headline = headline;
        this.content = content;
    }

    public Text(Word headline) {
        this.headline = headline;
        this.content = new ArrayList<>();
    }
    public Text(Word headline, Sentence sentence) {
        this.headline = headline;
        this.content = new ArrayList<>();
        this.content.add(sentence);
    }
    void addSentence (Sentence sentence){
        this.content.add(sentence);
    }
    void textPrint(){
        for (Sentence sentence: this.content){
            System.out.println(sentence);
        }
    }
    void headlinePrint(){
        System.out.println(headline);
    }

    public Word getHeadline() {
        return headline;
    }

    public void setHeadline(Word headline) {
        this.headline = headline;
    }
}
