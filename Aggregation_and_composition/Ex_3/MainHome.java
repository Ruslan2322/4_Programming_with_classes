package Lesson_04_Aggregation_composition.Ex_3;

// Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
// столицу, количество областей, площадь, областные центры.

public class MainHome {
    public static void main(String...args){
        City kiev = new City("Kiev", 2884885);
        City moskow = new City("Moskow", 16456755);
        City minsk = new City("Minsk", 1975684);
        Country USSR = new Country("USSR", moskow);


        USSR.addRegion(new Region("USSR", moskow, 17100000 ));
        USSR.addRegion(new Region("UUSR", kiev, 603628 ));
        USSR.addRegion(new Region("BUSR", minsk, 207595 ));




        USSR.printCapital();
        USSR.printNumberOfRegions();
        USSR.printArea();
        USSR.printRegions();

    }
}
