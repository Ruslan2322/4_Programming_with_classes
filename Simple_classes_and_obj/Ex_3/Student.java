package Lesson_04_Simple_classes_and_obj;

// Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
// из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
// номеров групп студентов, имеющих оценки, равные только 9 или 10.

public class Student {

    private String surname;
    private int groupNum;
    private int [] efficienty;

    private Student(String name, int groupNum, int [] efficienty) {
        this.surname = name;
        this.groupNum = groupNum;
        this.efficienty = efficienty;
    }

    private static void printExcellentStudent(Student [] students){
        for (Student student : students) {
            int minGrade = 10;
            for (int grade : student.efficienty) {
                if (grade < minGrade) {
                    minGrade = grade;
                }
            }
            if (minGrade >= 9) {
                System.out.printf("Smart student: %s, from group %d. %n", student.surname, student.groupNum);
            }
        }
    }

    public static void main(String[] args) {
        Student [] students = new Student[10];

        students[0] = new Student("Леонов Ф.И.", 15, new int[]{7, 6, 8, 7, 9});
        students[1] = new Student("Ячнов М.П.", 20, new int[]{9, 8, 8, 10, 9});
        students[2] = new Student("Пало В.Ю.", 15, new int[]{4, 5, 7, 10, 6});
        students[3] = new Student("Черновков Ю.С.", 24, new int[]{10, 10, 10, 10, 10});
        students[4] = new Student("Кумборев Я.В.", 20, new int[]{7, 6, 8, 7, 9});
        students[5] = new Student("Чихин А.А.", 24, new int[]{9, 9, 10, 10, 9});
        students[6] = new Student("Веровако В.С.", 21, new int[]{9, 9, 8, 10, 9});
        students[7] = new Student("Рявков П.П..", 15, new int[]{3, 6, 5, 7, 4});
        students[8] = new Student("Вольнов В.Е.", 15, new int[]{7, 9, 8, 7, 9});
        students[9] = new Student("Сибека Л.Д.", 15, new int[]{10, 9, 9, 10, 9});

        printExcellentStudent(students);
    }
}
