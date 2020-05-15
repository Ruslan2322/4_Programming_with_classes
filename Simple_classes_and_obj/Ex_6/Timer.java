package Lesson_04_Simple_classes_and_obj.Ex_6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// Exersize_06. Составьте  описание  класса  для  представления  времени.  Предусмотрте  возможности установки  времени  и
// изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
// недопустимых  значений полей  поле  устанавливается  в  значение  0.  Создать  методы  изменения  времени на
// заданное количество часов, минут и секунд.

public class Timer {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in); // Выставляем время
        int d = 0;
        System.out.println("Введите значение HH: ");
        int a = s.nextInt();
        if (a > 23 || a < 0)
            a = d;
        System.out.println("Введите значение MM: ");
        int b = s.nextInt();
        if (b > 59 || b < 0)
            b = d;
        System.out.println("Введите значение SS: ");
        int c = s.nextInt();
        if (c > 59 || c < 0 )
            c = d;
         TimerSet timeDescriptionZero = new TimerSet(a, b, c);

        System.out.println(timeDescriptionZero.getHours() + ":" + timeDescriptionZero.getMinutes() + ":" + timeDescriptionZero.getSeconds());

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Часы. Введите для увеличения\"+\" или для уменьшения\"-\" ");
            String operatorHour = reader.readLine();
            System.out.println("Введите разницу в часах ");
            int hours = Integer.parseInt(reader.readLine());

            System.out.println("Минуты. Введите для увеличения \"+\" или для уменьшения\"-\" ");
            String operatorMinute = reader.readLine();
            System.out.println("Введите разницу в минутах ");
            int minutes = Integer.parseInt(reader.readLine());

            System.out.println("Введите для увеличения \"+\" or decrementing\"-\" for seconds ");
            String operatorSecond = reader.readLine();
            System.out.println("Введите разницу в секундах ");
            int seconds = Integer.parseInt(reader.readLine());

            System.out.println(changeHour(timeDescriptionZero.getHours(), operatorHour, hours) + ":" +
                    changeMinute(timeDescriptionZero.getMinutes(), operatorMinute, minutes) + ":" +
                    changeSecond(timeDescriptionZero.getSeconds(), operatorSecond, seconds)
            );

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int changeHour(int hour, String operator, int hours) {
        int change = 0;
        if (operator.equals("+"))
            change = hour + hours;
        else if (operator.equals("-"))
            change = hour - hours;
        return change;
    }

    private static int changeMinute(int minute, String operator, int minutes) {
        int change = 0;
        if (operator.equals("+"))
            change = minute + minutes;
        else if (operator.equals("-"))
            change = minute - minutes;
        return change;
    }

    private static int changeSecond(int second, String operator, int seconds) {
        int change = 0;
        if (operator.equals("+"))
            change = second + seconds;
        else if (operator.equals("-"))
            change = second - seconds;
        return change;
    }
}