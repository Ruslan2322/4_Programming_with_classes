package Lesson_04_Simple_classes_and_obj.Ex_7;

public class Side {
    private Dot a;
    private Dot b;

    Side (Dot a, Dot b){
        this.a = a;
        this.b = b;
    }

    public Dot getA() {
        return a;
    }

    public Dot getB() {
        return b;
    }
    double CalculateSide(){
        return Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
    }
}
