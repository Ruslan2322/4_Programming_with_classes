package Lesson_04_Simple_classes_and_obj.Ex_10;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

//  Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
// и метод  toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
// методами. Задать критерии выбора данных и вывести эти данные на консоль.
// Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
// Найти и вывести:
// a) список рейсов для заданного пункта назначения;
// b) список рейсов для заданного дня недели;
// c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

/* I have error "Exception in thread "main" java.lang.NullPointerException
	at Lesson_04_Simple_classes_and_obj.Ex_10.AirplaneList.addAirline(AirplaneList.java:36)
	at Lesson_04_Simple_classes_and_obj.Ex_10.AirMain.main(AirMain.java:9)
	in method addAirline class Airplanelist
	And I didn't understand where is mistake*/

public class AirMain {
    public static void main(String... args) throws ParseException {
        AirplaneList airplaneList = new AirplaneList("Moskow, Vnukovo (VKO)", new ArrayList<Airline>());
        airplaneList.addAirline("Surgut", "C32-32", "Boeng 737-500",
                Airline.ft.parse("4:00"), new DayOfWeek[]{DayOfWeek.FRIDAY, DayOfWeek.SATURDAY,
                        DayOfWeek.SUNDAY, DayOfWeek.EVERYDAY});
        airplaneList.addAirline("Siktifkar", "UT 375", "Boeng 737-500(v)",
                Airline.ft.parse("14:05"), new DayOfWeek[]{DayOfWeek.MONDAY, DayOfWeek.SATURDAY,
                        DayOfWeek.SUNDAY, DayOfWeek.EVERYDAY});
        airplaneList.addAirline("Rostov na Donu", "A4 202", "CU 95",
                Airline.ft.parse("16:00"), new DayOfWeek[]{DayOfWeek.FRIDAY, DayOfWeek.THURSDAY,
                        DayOfWeek.SUNDAY, DayOfWeek.EVERYDAY});
        airplaneList.addAirline("Kursk(East)", "RG 121", "CRI 200",
                Airline.ft.parse("18:00"), new DayOfWeek[]{DayOfWeek.MONDAY, DayOfWeek.SATURDAY,
                        DayOfWeek.SUNDAY, DayOfWeek.EVERYDAY});
        airplaneList.addAirline("Irkutsk", "UTA 9817", "Boeng 767-200",
                Airline.ft.parse("22:05"), new DayOfWeek[]{DayOfWeek.FRIDAY, DayOfWeek.SATURDAY,
                        DayOfWeek.SUNDAY, DayOfWeek.EVERYDAY});

        System.out.println("The list of flights with destination Kursk(East): ");
        ArrayList<Airline> airlinesToKurskEast = airplaneList.flyingsToDestination("Kursk(East)");
        for (Airline flyings : airlinesToKurskEast) {
            System.out.println(flyings);
        }
        System.out.println("\nThe list of flights departing on Sunday:");
        ArrayList<Airline> airlinesOnSunday = airplaneList.flightDays(DayOfWeek.SUNDAY);
        for (Airline flyings : airlinesOnSunday) {
            System.out.println(flyings);
        }

        System.out.println("\nThe List of flights departing after 13:00 Tuesday:");
        Date time = Airline.ft.parse("13:00");
        ArrayList<Airline> airlinesOnTuesday = airplaneList.flightDays(DayOfWeek.MONDAY, time);
        for (Airline flyings : airlinesOnTuesday) {
            System.out.println(flyings);
        }
    }
}
