package Lesson_04_Aggregation_composition.Ex_3;

public class District {
    private String districtName;
    private City distictCenter;
    private double area;

    public District(String districtName, City distictCenter, double area) {
        this.districtName = districtName;
        this.distictCenter = distictCenter;
        this.area = area;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public City getDistictCenter() {
        return distictCenter;
    }

    public void setDistictCenter(City distictCenter) {
        this.distictCenter = distictCenter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
