package Lesson_04_Simple_classes_and_obj.Ex_8;

// Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
// и метод  toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
// и методами. Задать критерии выбора данных и вывести эти данные на консоль.
// Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
// Найти и вывести:
// a) список покупателей в алфавитном порядке;
// b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

import java.math.BigInteger;

public class Customer {
// Create variables
    private int id;
    private String surname;
    private String firstname;
    private String patronymic;
    private String address;
    private BigInteger creditCard_number; // Inner java class
    private long bankAcc_num;

    public Customer(BigInteger id, String surname, String firstname,
                    String patronymic, String address, BigInteger cardNumber, long bankAccountNumber) {
    }


    // Create method toString()
    @Override
    public String toString(){
        return String.format("id: %d, surname: %s, firstname: %s, middle_name: %s, adress: %s, " +
                " creditCard_number: %s, BankAcc_num: %s ", id , surname, firstname, patronymic,  address,  creditCard_number.toString(),bankAcc_num);
    }

// Create get-s and set-s for variables


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddle_name() {
        return patronymic;
    }

    public void setMiddle_name(String middle_name) {
        this.patronymic = middle_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigInteger getCreditCard_number() {
        return creditCard_number;
    }

    public void setCreditCard_number(BigInteger creditCard_number) {
        this.creditCard_number = creditCard_number;
    }

    public long getBankAcc_num() {
        return bankAcc_num;
    }

    public void setBankAcc_num(long bankAcc_num) {
        this.bankAcc_num = bankAcc_num;
    }

    // Create constructor for variables
    public Customer(String surname, String firstname, String middle_name, String adress, BigInteger creditCard_number, long bankAccountNumber, long bankAcc_num) {
        this.id = id;
        this.surname = surname;
        this.firstname = firstname;
        this.patronymic = middle_name;
        this.address = adress;
        this.creditCard_number = creditCard_number;
        this.bankAcc_num = bankAcc_num;
    }
}