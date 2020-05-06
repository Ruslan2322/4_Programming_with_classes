package Lesson_04_Simple_classes_and_obj;

    // Создайте  класс  Test1  двумя  переменными.  Добавьте  метод  вывода  на  экран  и  методы  изменения  этих
    // переменных. Добавьте метод, который находит сумму  значений этих  переменных, и  метод, который находит
    // наибольшее значение из этих двух переменных.

    public class Test1 {
        public static void main(String[] args) {
            int a = 5;
            int b = 6;

            print(a, b);
            ChangeNum(a, b);
            Sum(a,b);
            MaxVar(a,b);
            System.out.println("Max Var. = " +MaxVar(a, b));
            System.out.println("Amount a + b" +Sum(a, b));

        }

        private static int MaxVar(int a, int b) {
            return Math.max(a, b);
        }

        private static int Sum(int a, int b) {
            return a+b;
        }

        private static void ChangeNum(int a, int b) {
            a = 10;
            b = 8;
            System.out.println("Changed variables a & b: "+ a + " "+ b);
        }

        private static void print(int a,int b) {
            System.out.println("Start variables: " +a+" "+b);
        }
    }



