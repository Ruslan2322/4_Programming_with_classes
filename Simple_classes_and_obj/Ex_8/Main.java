package Lesson_04_Simple_classes_and_obj.Ex_8;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;

// Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
// и метод  toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
// и методами. Задать критерии выбора данных и вывести эти данные на консоль.
// Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
// Найти и вывести:
// a) список покупателей в алфавитном порядке;
// b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

public class Main {

    public static void main(String... args) {

            CustomerArray epamStudent = new CustomerArray("EPAM clients", new ArrayList<>());

            epamStudent.CustomerAdd("Baigolov", "Ruslan", "Igorevich", "Minsk,Belarus", new BigInteger("44324131"), 5456578, 2131);
            epamStudent.CustomerAdd("Petrov", "Vladimir", "Yaroslavovich", "Minsk,Belarus", new BigInteger("443131131"), 54542348, 2111);
            epamStudent.CustomerAdd("Yakovlev", "Petr", "Leonidovich", "Gomel,Belarus", new BigInteger("232452131"), 323232378, 73141);
            epamStudent.CustomerAdd("Nikolaev", "Igor", "Vladislavovich", "Minsk,Belarus", new BigInteger("867867328671"), 586786578, 8761);
            epamStudent.CustomerAdd("Zuborev", "Alexandr", "Victorovich", "Brest,Belarus", new BigInteger("76867324131"), 5456578, 2431);
            epamStudent.CustomerAdd("Veslov", "Sergey", "Andreevich", "Vitebsk,Belarus", new BigInteger("4343131"), 86236578, 267);


            System.out.println("Customer list:");
            epamStudent.sortName();
            for (int i = 0; i < epamStudent.getArr().size(); i++) {
                System.out.println(epamStudent.getArr().get(i));
            }

            System.out.println("\nCustomer list, \n" + "whose credit card number is in the specified interval:");
            ArrayList<Customer> list = epamStudent.getCustomerByCreditCardRange("20000", "300000000");
            list.sort(Comparator.comparing(Customer::getCreditCard_number));
            if (list.size() == 0) {
                System.out.println("Credit card not found");
            } else {
                for (Customer customer : list) {
                    System.out.println(customer);
                }
            }
        }
    }

