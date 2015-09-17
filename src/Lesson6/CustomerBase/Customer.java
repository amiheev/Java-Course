package Lesson6.CustomerBase;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Alexey on 16.09.2015.
 */
public class Customer {
    public static final List<Customer> customerList = new ArrayList<>();
    private int id = 0;
    private String surname;
    private String name;
    private String cardNumber;
    private long accountNumber;

    Pattern creditCard = Pattern.compile("[0-9]{16}");





    Address address = new Address();

    public Customer() {
    }

    public Customer(int id, String surname, String name, String cardNumber, long accountNumber, String city, String street, int houseNumber, int flatNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.cardNumber = cardNumber;
        this.accountNumber = accountNumber;
        address.setCity(city);
        address.setStreet(street);
        address.setHouseNumber(houseNumber);
        address.setFlatNumber(flatNumber);
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        Matcher m = creditCard.matcher(cardNumber);
        boolean isCorrect = m.matches();
        if (isCorrect){
            this.cardNumber = cardNumber;
        }else System.out.println(cardNumber +  " incorrect type of credit card");;



    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        if (accountNumber > 0000000000000000 & accountNumber < 9999999999999999l)
        this.accountNumber = accountNumber;
    }

    public String toString(){
        return "id " + getId() + ", name " + getName() + ", surname " + getSurname() + ", city " +  address.getCity() + ", street " + address.getStreet() + ", house " + address.getHouseNumber() +
                ", flat " + address.getFlatNumber() + ", card number " + getCardNumber() + ", account number " + getAccountNumber();
    }


}

