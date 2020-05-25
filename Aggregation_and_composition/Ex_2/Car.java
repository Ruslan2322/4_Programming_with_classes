package Lesson_04_Aggregation_composition.Ex_2;

import MyPractice.Learn.Encapsulation.Encapsulation;
import java.util.ArrayList;
import java.util.Arrays;

class Car {
    private String modelName;
    private Engine engine;
    private ArrayList<Wheel> wheels;
    private boolean isFuel;

    Car(String modelName) {
        this.modelName = modelName;
        this.wheels = new ArrayList<>(4);
        this.isFuel = true;
    }

    void setEngine(Engine engine) {
        this.engine = engine;
    }

    ArrayList<Wheel> getWheels() {
        return wheels;
    }

    void setWheels(Wheel w1, Wheel w2, Wheel w3, Wheel w4) {
        this.wheels = new ArrayList<>(Arrays.asList(w1, w2, w3, w4));
    }

    String getModelName() {
        return modelName;
    }

    void changeWheel() {
        for (int i = 0; i < 4; i++) {
            if (!wheels.get(i).isGood()) {
                System.out.printf("Wheel number %d is changed.\n", i + 1);
                int wheelDia = this.getWheels().get(i).getDiametr();
                this.getWheels().set(i, new Wheel(wheelDia));
            }
        }
    }

    void setFuel(boolean fuel) {
        this.isFuel = fuel;
    }

    void refuel() {
        this.isFuel = true;
        System.out.println("The car is refueled.");
    }


    void run() {
        int wheelCounter = 0;
        String message = "";
        boolean isEngine = false;

        for (Wheel wheel : wheels) {
            if (wheel != null) {
                wheelCounter++;
            }
        }
        if (wheelCounter == 0) {
            message = "- wheels are not installed. please install 4 wheels.\n";
        } else if (wheelCounter == 1) {
            message = "- only 1 wheel installed. please install 3 more wheels\n";
        } else if (wheelCounter == 2 || wheelCounter == 3) {
            message = String.format("- only %d wheels installed. please install %d more wheels\n", wheelCounter, 4 - wheelCounter);
        }
        System.out.print(message);

        if (engine == null) {
            System.out.println("- engine not installed. please install the engine.");
        } else {
            isEngine = true;
        }

        if (isEngine && wheelCounter == 4) {
            boolean ready = true;
            for (int i = 0; i < 4; i++) {
                if (!wheels.get(i).isGood()) {
                    System.out.printf("- wheel number %d is broken. Please replace the wheel.%n", i + 1);
                    ready = false;
                }
            }
            if (!isFuel) {
                System.out.println("- out of fuel. It is necessary to refuel.");
            } else if (ready) {
                System.out.println("- the car goes on the road!");
            }
        }

    }

}
//import java.util.ArrayList;
//
//public class Car {
//    private String modelName;
//    private Engine engine;
//    private ArrayList<Wheel> wheels;
//    private boolean isFuel;
//
//    public Car(String modelName) {
//        this.modelName = modelName;
//        this.engine = engine;
//        this.wheels = new ArrayList<>(4);
//        this.isFuel = true;
//    }
//
//    // Function for change wheels
//    void changeWheel() {
//        for (int i = 0; i < 4; i++) {
//            if (!wheels.get(i).isGood()) {
//                System.out.println("Wheel number %d is changed.\n");
//                int wheelDia = this.getWheels().get(i).getDiametr();
//                this.getWheels().set(i, new Wheel(wheelDia));
//            }
//        }
//    }
//
//    // Function for refuel
//    void refuel() {
//        this.isFuel = true;
//        System.out.println("Car is refueled");
//    }
//
//    // Function for run
//    void run() {
//        int wheelCounter = 0;
//        String message = "";
//        boolean isEngine = false;
//
//        for (Wheel wheel : wheels) {
//            if (wheel != null) {
//                wheelCounter++;
//            }
//        }
//        if (wheelCounter == 0) {
//            message = "- wheels are not installed. please install 4 wheels.\n";
//        } else if (wheelCounter == 1) {
//            message = "- only 1 wheel installed. please install 3 more wheels\n";
//        } else if (wheelCounter == 2 || wheelCounter == 3) {
//            message = String.format("- only %d wheels installed. please install %d more wheels\n", wheelCounter, 4 - wheelCounter);
//        }
//        System.out.print(message);
//
//        if (engine == null) {
//            System.out.println("- engine not installed. please install the engine.");
//        } else {
//            isEngine = true;
//        }
//
//
//        if (isEngine && wheelCounter == 4) {
//            boolean ready = true;
//            for (int i = 0; i < 4; i++) {
//                if (!wheels.get(i).isGood()) {
//                    System.out.printf("- wheel number %d is broken. Please replace the wheel.%n", i + 1);
//                    ready = false;
//                }
//            }
//            if (!isFuel) {
//                System.out.println("- out of fuel. It is necessary to refuel.");
//            } else if (ready) {
//                System.out.println("- the car goes on the road!");
//            }
//        }
//
//    }
//
//
//
//
//// Getters and setters
//    public String getModelName() {
//        return modelName;
//    }
//
//    public void setModelName(String modelName) {
//        this.modelName = modelName;
//    }
//
//    public Engine getEngine() {
//        return engine;
//    }
//
//    public void setEngine(Engine engine) {
//        this.engine = engine;
//    }
//
//    public ArrayList<Wheel> getWheels() {
//        return wheels;
//    }
//
//    public void setWheels(ArrayList<Wheel> wheels) {
//        this.wheels = wheels;
//    }
//
//    public boolean isFuel() {
//        return isFuel;
//    }
//
//    public void setFuel(boolean fuel) {
//        isFuel = fuel;
//    }
//
//    public void setWheels(Wheel wheel, Wheel wheel1, Wheel wheel2, Wheel wheel3) {
//
//
//    }
//}
