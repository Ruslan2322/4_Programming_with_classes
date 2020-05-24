package Lesson_04_Aggregation_composition.Ex_1;


//  Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
//  консоль текст, заголовок текста.

       public class MainText {
           public static void main(String... args) {

               Word headline = new Word("Biden apology after saying black voters considering Trump 'ain't black'"+"\n ");
               String line = "Democratic White House candidate Joe Biden is in damage limitation mode after saying African Americans \"ain't black\" if they even consider voting for President Donald Trump over him" +
                       "Gaffe-prone Mr Biden made the remark in an interview on Friday with a prominent black radio host, Charlamagne Tha God, about his outreach to black voters" +
                       "Mr Biden later expressed regret for the \"cavalier\" comment"+
                       "The black vote has been key to the Biden candidacy.\n";
               Sentence sentence = new Sentence(line);
               Text news = new Text(headline, sentence);

               String line2 = "What exactly did Biden say?\n" +
                       "Throughout the 18-minute interview, Mr Biden, 77, stressed his longstanding ties to the black community," +
                       " \n noting his overwhelming win this year in South Carolina's presidential primary, a state where the Democratic electorate is more than 60% African American.";

               String line3 = "I won every single county. I won the largest share of the black vote that anybody had," +
                       "\n including Barack,\" he said of President Barack Obama, the country's first African-American president, who picked Mr Biden as his running mate.";

               news.addSentence(new Sentence(line2));
               news.addSentence(new Sentence(line3));

               news.headlinePrint();

               news.textPrint();


           }
       }


