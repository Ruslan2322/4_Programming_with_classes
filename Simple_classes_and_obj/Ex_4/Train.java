package Lesson_04_Simple_classes_and_obj;

// Создайте  класс  Train,  содержащий  поля:  название  пункта  назначения,  номер  поезда,  время  отправления.
// Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
// номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
// Добавьте  возможность  сортировки  массив  по  пункту  назначения,  причем  поезда  с  одинаковыми  пунктами
// назначения должны быть упорядочены по времени отправления.

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Train {

    private String DestinationName;
    private String trainNum;
    private Date departureTime;
    private static SimpleDateFormat ft = new SimpleDateFormat("HH:mm");

    private Train(String DestinationName, String trainNum, Date departureTime) {
        this.DestinationName = DestinationName;
        this.trainNum = trainNum;
        this.departureTime = departureTime;
    }

    private static void sortingTrainNumber(Train [] trains) {
        Train temp;
        for (int i = 0; i < trains.length; i++) {
            for (int j = trains.length - 1; j > i; j--) {
                if (trains[i].trainNum.compareTo(trains[j].trainNum) > 0) {
                    temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;
                }
            }
        }
    }

    private static void sortTraindestinationName(Train [] trains) {
        Train temp;
        for (int i = 0; i < trains.length; i++) {
            for (int j = trains.length - 1; j > i; j--) {
                int compare = trains[i].DestinationName.compareTo(trains[j].DestinationName);
                if (compare > 0) {
                    temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;
                } else if (compare == 0) {
                    if (trains[i].departureTime.compareTo(trains[j].departureTime) > 0) {
                        temp = trains[i];
                        trains[i] = trains[j];
                        trains[j] = temp;
                    }
                }
            }
        }
    }

    private static String informationOfTrain(Train [] trains, String trainNum) {

        for (Train train : trains) {
            if (train.trainNum.equalsIgnoreCase(trainNum)) {
                return "destinationName: " + train.DestinationName +
                        ", departure time: " + ft.format(train.departureTime);
            }
        }
        return null;
    }

    public static void main(String[] args) throws ParseException {
        Train [] trains = new Train[5];
        trains[0] = new Train("Gomel", "456", ft.parse("05:58"));
        trains[1] = new Train("Vilnus", "687", ft.parse("10:48"));
        trains[2] = new Train("Moskow", "931", ft.parse("13:15"));
        trains[3] = new Train("Berlin", "099", ft.parse("18:41"));
        trains[4] = new Train("Kiev", "133", ft.parse("06:40"));
        sortingTrainNumber(trains);

        for (Train train : trains) {
            System.out.println(train.trainNum);
        }

        String request = "099";
        System.out.printf("%nTrain #%s, ", request);
        System.out.println(informationOfTrain(trains, request) + "\n");
        sortTraindestinationName(trains);

        for (Train train : trains) {
            System.out.println(train.DestinationName + " " + train.trainNum + " - " + ft.format(train.departureTime));
        }
    }

}