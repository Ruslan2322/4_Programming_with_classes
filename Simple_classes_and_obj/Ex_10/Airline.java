package Lesson_04_Simple_classes_and_obj.Ex_10;



import java.text.SimpleDateFormat;
import java.util.Date;

public class Airline {
    private String destination;
    private String flight_number;
    private String airplaneType;
    private Date departure_time;
    private DayOfWeek[] dayOfWeek;

    static SimpleDateFormat ft = new SimpleDateFormat("HH:mm");

// Create class constructor


    public Airline(String destination, String flight_number, String airplaneType, Date departure_time, DayOfWeek[] dayOfWeek) {
        this.destination = destination;
        this.flight_number = flight_number;
        this.airplaneType = airplaneType;
        this.departure_time = departure_time;
        this.dayOfWeek = dayOfWeek;
    }



    // Create toString Method
    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flight_number=" + flight_number +
                ", airplaneType='" + airplaneType + '\'' +
                ", departure_time=" + departure_time +
                ", DayOfWeek='" + dayOfWeek + '\'' +
                '}';
    }

    // Create get-s and set-s

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(String flight_number) {
        this.flight_number = flight_number;
    }

    public String getAirplaneType() {
        return airplaneType;
    }

    public void setAirplaneType(String airplaneType) {
        this.airplaneType = airplaneType;
    }

    public Date getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(Date departure_time) {
        this.departure_time = departure_time;

    }

    public DayOfWeek[] getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek[] dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public static SimpleDateFormat getFt() {
        return ft;
    }

    public static void setFt(SimpleDateFormat ft) {
        Airline.ft = ft;
    }
}
