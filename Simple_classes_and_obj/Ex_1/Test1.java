package Lesson_04_Simple_classes_and_obj;

import java.util.Scanner;

// Создайте  класс  Test1  двумя  переменными.  Добавьте  метод  вывода  на  экран  и  методы  изменения  этих
// переменных. Добавьте метод, который находит сумму  значений этих  переменных, и  метод, который находит
// наибольшее значение из этих двух переменных.

public class Test1 {


    public static void main(String[] args) {

        int a = 2;
        int b = 5;

        print(a, b);
        Change(a, b);
        summ(a, b);
        Max(a, b);
    }

    public static void print(int a, int b) {
        System.out.println("Значение a = "+a);
        System.out.println("Значение b = "+b);
    }
    public static void Change(int a, int b) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите значение а: ");
        a = s.nextInt();
        System.out.println("Введите значение b: ");
        b = s.nextInt();
        System.out.println("Значения a и b изменены на :"+a+" и "+b);
    }
    public static void summ(int a, int b){

        int c = a + b;
        System.out.println("Сумма значений a и b ="+c);
    }
    public static void Max(int a, int b){
        System.out.println("Максимальное число равно =" +Math.max(a,b));;
    }
}


