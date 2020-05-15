package Lesson_04_Simple_classes_and_obj.Ex_7;

// Exercise_07.Описать  класс,  представляющий  треугольник.  Предусмотреть  методы  для  создания объектов,  вычисления
// площади, периметра и точки пересечения медиан.

import java.util.Locale;
import java.util.Scanner;

public class Triangle {
    private Side A;
    private Side B;
    private Side C;

    private Triangle(Side a, Side b, Side c) {
        A = a;
        B = b;
        C = c;
    }
    private static Triangle CreateTriangle(Dot a, Dot b, Dot c){ // Конструктор создания треугольника
        Side A = new Side(a, b);
        Side B = new Side(b, c);
        Side C = new Side(a, c);
        return new Triangle(A, B, C);
    }
    // Метод расчета периметра
    private double CalculatePerimetr() { // Метод расчета периметра треугольника
        return A.CalculateSide() + B.CalculateSide() + C.CalculateSide();
    }

    // Метод расчета площади треугольника
        private double CalculateSquare() {
        double p = CalculatePerimetr() / 2;
                return Math.sqrt(p *  (p - A.CalculateSide()) * (p - B.CalculateSide()) * (p - C.CalculateSide()));
            }
            private Dot PointMedianIntersection() {
            double x = (A.getA().getX() + A.getB().getX() + B.getB().getX()) / 3;
            double y = (A.getA().getY() + A.getB().getY() + B.getB().getY()) / 3;
            return new Dot(x, y);
        }


    public static void main(String[] args) {


        Scanner s = new Scanner(System.in); // Выставляем координаты с помощью консоли
        System.out.println("Введите координаты точки a: ");
        int a1, a2;
       a1 = (int) s.nextDouble();
       a2 = (int) s.nextDouble();

        System.out.println("Введите координаты точки b: ");
        int b1, b2;
       b1 = s.nextInt();
       b2 = s.nextInt();

        System.out.println("Введите координаты точки c: ");
        int c1;
        int c2;
       c1 = s.nextInt();
       c2 = s.nextInt();

        Dot a = new Dot (a1, a2);
        Dot b = new Dot (b1, b2);
        Dot c = new Dot (c1, c2);
            System.out.printf(Locale.US,"Координаты треугольника: a(%.1f,%.1f); b(%.1f,%.1f); c(%.1f,%.1f).%n",
                    a.getX(), a.getY(), b.getX(), b.getY(), c.getX(), c.getY());
            Triangle triangle = CreateTriangle(a, b, c);
            double perimetr = (double) triangle.CalculatePerimetr();
            System.out.printf("Периметр = "+ perimetr);

            double square = triangle.CalculateSquare();
            System.out.printf("Площадь треугольника = "+ square);

            Dot med = triangle.PointMedianIntersection();

            System.out.printf("Медиана = " + med.getX(), med.getY());

        }
    }

