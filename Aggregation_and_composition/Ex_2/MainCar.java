package Lesson_04_Aggregation_composition.Ex_2;
//  Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
//  менять колесо, вывести на консоль марку автомобиля.
public class MainCar {

    public static void main(String[] args) {
        Car bmw = new Car("X5");
        System.out.printf("We created a car %s. Trying to drive:%n", bmw.getModelName());
        bmw.run();

        Engine engine = new Engine(270, 5.0);
        bmw.setEngine(engine);
        System.out.printf("%nA %d hp engine is installed. A volume of %.3f liters. Trying to drive:%n",
                engine.getHorsePower(), engine.getVolume());
        bmw.run();

        int whellDiameter = 19;
        bmw.setWheels(new Wheel(whellDiameter), new Wheel(whellDiameter), new Wheel(whellDiameter), new Wheel(whellDiameter));
        System.out.printf("%nWheels are installed. Trying to drive:\n");
        bmw.run();

        bmw.getWheels().get(2).breakWheel();
        System.out.println("\nSTOP! Something broke.\nTrying to drive:");
        bmw.run();

        bmw.changeWheel();
        System.out.println("\nTrying to drive:");
        bmw.run();

        System.out.println("...");
        bmw.setFuel(false);
        bmw.run();
        bmw.refuel();
        

        System.out.println("\nCar model: " + bmw.getModelName());
    }
}


