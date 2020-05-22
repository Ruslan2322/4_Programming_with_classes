package Lesson_04_Simple_classes_and_obj.Ex_10;

import java.util.ArrayList;
import java.util.Date;

public class AirplaneList {

    private String endPoint;
    private ArrayList<Airline> flyings;

    // Create class constructor
    public AirplaneList(String endPoint, ArrayList<Airline> flying) {
        this.endPoint = endPoint;
        this.flyings = flyings;
    }

    // Create get-s and set-s
    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public ArrayList<Airline> getFlying() {
        return flyings;
    }

    public void setFlying(ArrayList<Airline> flying) {
        this.flyings = flying;
    }

    // function for add flyings
    void addAirline(String destination, String flightNumber, String airplaneType, Date departure_time, DayOfWeek[] dayOfWeek) {
        flyings.add(new Airline(destination, flightNumber, airplaneType, departure_time, dayOfWeek));

    }

    ArrayList<Airline> flyingsToDestination(String destination) {
        ArrayList<Airline> flyings = new ArrayList<>();
        for (Airline flying : this.flyings) {
            if (flying.getDestination().equals(destination)) {
                flyings.add(flying);
            }
        }
        return flyings;
    }
    ArrayList<Airline> flightDays(DayOfWeek dayOfWeek) {
        ArrayList<Airline> flyings = new ArrayList<>();
        for (Airline flying : this.flyings) {
            for (DayOfWeek day : flying.getDayOfWeek()) {
                if (day == dayOfWeek || day == DayOfWeek.EVERYDAY) {
                    flyings.add(flying);
                    break;
                }
            }
        }
        return flyings;
    }
    ArrayList<Airline> flightDays(DayOfWeek dayOfWeek, Date departure_time) {
        ArrayList<Airline> flyings = new ArrayList<>();
        for (Airline flying : this.flyings) {
            for (DayOfWeek day : flying.getDayOfWeek()) {
                if (day == dayOfWeek || day == DayOfWeek.EVERYDAY) {
                    if (flying.getDeparture_time().compareTo(departure_time) >= 0) {
                        flyings.add(flying);
                        break;
                    }

                }
            }
        }
        return flyings;
    }
}