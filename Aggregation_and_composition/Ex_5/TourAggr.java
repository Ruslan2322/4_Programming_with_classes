package Lesson_04_Aggregation_composition.Ex_5;

import java.util.ArrayList;
import java.util.Comparator;

public class TourAggr {
    private String agencyName;
    private ArrayList<TourPack> tourPacks;
    private ArrayList<TClient> clients;

    public TourAggr(String agencyName) {
        this.agencyName = agencyName;
        this.tourPacks = new ArrayList<>();
        this.clients = new ArrayList<>();
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public ArrayList<TourPack> getTourPacks() {
        return tourPacks;
    }

    public void setTourPacks(ArrayList<TourPack> tourPacks) {
        this.tourPacks = tourPacks;
    }

    public ArrayList<TClient> getClients() {
        return clients;
    }

    public void setClients(ArrayList<TClient> clients) {
        this.clients = clients;
    }

    public static void printTours(ArrayList<TourPack> packs) {
        if (packs.size() == 0) {
            System.out.println("not found");
            return;
        }
        for (TourPack tour : packs) {
            System.out.println("Tour :" +tour.getCountry());
            System.out.println("City :"+ tour.getCity());
            System.out.println("Type :" +tour.getType());
            System.out.println("Transport :"+ tour.getTransport());
            System.out.println("Nutrition :"+ tour.getNutrition());
            System.out.println("Time : " + tour.getTime());
            System.out.println("Price :"+ tour.getPrice());
        }
    }

    public static void sortByNumberOfDays(ArrayList<TourPack> tour) {
        tour.sort(Comparator.comparing(TourPack::getTime));

    }

    public static void sortByPrice(ArrayList<TourPack> tour) {
        tour.sort(Comparator.comparing(TourPack::getPrice));
    }



    void addTourPackage(TourPack tour) {
        tourPacks.add(tour);
    }


    public ArrayList<TourPack> selectByTourPackType(TourPackType type) {
        ArrayList<TourPack> packs = new ArrayList<>();
        for (TourPack tour : tourPacks) {
            if (tour.getType().equals(type)) {
                packs.add(tour);
            }
        }
        return packs;
    }

    public ArrayList<TourPack> selectByMoreOption(Transport trans, Nutrition breakfast, int i) {
        ArrayList<TourPack> packs = new ArrayList<>();
        for (TourPack tour : tourPacks) {
            if (tour.getTransport() == trans) {
                packs.add(tour);
            }
        }
        return packs;
    }
    void addClient(TClient tclient, TourPack tour) {
        tclient.setTourPack(tour);
        clients.add(tclient);
    }
}
