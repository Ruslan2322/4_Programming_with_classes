package Lesson_04_Aggregation_composition.Ex_5;

import java.util.ArrayList;

public class MainTravel {

    // Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
    // различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
    // возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.


        public static void main(String...args) {

            TourAggr Coraltravel = new TourAggr("Coral Travel"); //Create class TourAggr

            TClient tclient = new TClient("Piter", "Sverdlov", 200.00); // Create class TClient
            Coraltravel.addTourPackage(new TourPack("Spain", "Barcelona", TourPackType.CRUISE, Transport.SHIP, Nutrition.BREAKFAST, 12, 1099.99)); //Create Class TourPackType

            Coraltravel.addTourPackage(new TourPack("Tailand", "V VILAS HUA HIN", TourPackType.RECREATION,
                    Transport.PLANE, Nutrition.ALL_INCLUSIVE, 14, 340.44));
            Coraltravel.addTourPackage(new TourPack("Tailand", "CHIVA SOM", TourPackType.EXCURSION,
                    Transport.BUS, Nutrition.NOT_INCLUDET, 5, 230.54));
            Coraltravel.addTourPackage(new TourPack("Tailand", "BANAYAN TREE SAMUI", TourPackType.RECREATION,
                    Transport.PLANE, Nutrition.BREAKFAST, 15, 220.20));
            Coraltravel.addTourPackage(new TourPack("Tailand", "AETAS RESIDENS", TourPackType.TREATMENT,
                    Transport.BUS, Nutrition.ALL_INCLUSIVE, 8, 1000.00));
            Coraltravel.addTourPackage(new TourPack("Maldives", "RASHU HIYAYA", TourPackType.EXCURSION,
                    Transport.PLANE, Nutrition.ALL_INCLUSIVE, 10, 970.00));
            Coraltravel.addTourPackage(new TourPack("Maldives", "ARENA BEACH", TourPackType.CRUISE,
                    Transport.SHIP, Nutrition.BREAKFAST, 20, 1299.99));
            Coraltravel.addTourPackage(new TourPack("Maldives", "ERIADU ISLAND", TourPackType.SHOPPING,
                    Transport.PLANE, Nutrition.BREAKFAST, 3, 450.40));
            Coraltravel.addTourPackage(new TourPack("Maldives", "HOLIDAY ISLAND RESORT", TourPackType.TREATMENT,
                    Transport.TRAIN, Nutrition.ALL_INCLUSIVE, 13, 889.90));
            Coraltravel.addTourPackage(new TourPack("Maldives", "PARADISE ISLAND", TourPackType.SHOPPING,
                    Transport.CAR, Nutrition.NOT_INCLUDET, 5, 450.98));

            System.out.println("Select by excursion:");
            ArrayList<TourPack> selectByType = Coraltravel.selectByTourPackType(TourPackType.EXCURSION);
            TourAggr.printTours(selectByType);

            System.out.println("\nSelect by ship:");
            ArrayList<TourPack> selectByOption = Coraltravel.selectByMoreOption(Transport.SHIP, Nutrition.BREAKFAST, 7);
            TourAggr.sortByNumberOfDays(selectByOption);
            TourAggr.printTours(selectByOption);

            System.out.println("\nSelect by plane and breakfast:");
            selectByOption = Coraltravel.selectByMoreOption(Transport.PLANE, Nutrition.BREAKFAST, 7);
            TourAggr.sortByPrice(selectByOption);
            TourAggr.printTours(selectByOption);

            System.out.println("\nSelect by bus, all inclusive and for 7 days:");
            selectByOption = Coraltravel.selectByMoreOption(Transport.BUS, Nutrition.ALL_INCLUSIVE, 7);
            TourAggr.sortByPrice(selectByOption);
            TourAggr.printTours(selectByOption);

            System.out.println("\nSelect by bus, all inclusive and for 8 days:");
            selectByOption = Coraltravel.selectByMoreOption(Transport.BUS, Nutrition.ALL_INCLUSIVE, 8);
            TourAggr.sortByPrice(selectByOption);
            TourAggr.printTours(selectByOption);

            System.out.println("\nSelect for 5 days:");
            selectByOption = Coraltravel.selectByMoreOption(Transport.SHIP, Nutrition.ALL, 5);
            TourAggr.sortByPrice(selectByOption);
            TourAggr.printTours(selectByOption);

            Coraltravel.addClient(tclient, selectByOption.get(0));

    }
}
