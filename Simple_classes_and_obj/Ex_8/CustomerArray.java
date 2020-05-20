package Lesson_04_Simple_classes_and_obj.Ex_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;

public class CustomerArray {

    private String clients_group;
    private ArrayList<Customer> arr;

    // Create constructor
    public CustomerArray(String clients_group, ArrayList<Customer> arr) {
        this.clients_group = clients_group;
        this.arr = arr;
    }

    void sortName() {
        arr.sort(Comparator.comparing(Customer::getSurname));
    }

    // Array create method
    ArrayList<Customer> getCustomerByCreditCardRange(String min, String max) {
        ArrayList<Customer> arr1 = new ArrayList<>();//Standart java class
        for (Customer customer : this.arr) {
            if (customer.getCreditCard_number().toString().compareTo(min) > 0 && customer.getCreditCard_number().toString().compareTo(max) < 0) {
                arr.add(customer);
            }
        }
        return arr;
    }

    // Create get-s and set-s for variables
    public String getClients_group() {
        return clients_group;
    }

    public void setClients_group(String clients_group) {
        this.clients_group = clients_group;
    }

    public ArrayList<Customer> getArr() {
        return arr;
    }

    public void setArr(ArrayList<Customer> arr) {
        this.arr = arr;
    }

    // Create constructor for customer record
    public void CustomerAdd(String surname, String firstname, String patronymic, String address, BigInteger cardNumber, long bankAccountNumber, int id) {
        this.arr.add(new Customer(surname, firstname, patronymic, address, cardNumber, bankAccountNumber, id));

    }


    }




