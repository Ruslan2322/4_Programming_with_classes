package Lesson_04_Aggregation_composition.Ex_4;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Client>clients;

    public Bank(String name) {
        this.name = name;
        this.clients = new ArrayList<>();
    }

    public void addNewClient(Client client) {
        clients.add(client);
    }

    public Client getClient(String passportID) {
        for (Client person: clients){
            if (person.getPassportID().equals(passportID)){
                return person;
            }
        }
    return null;
    }
}
