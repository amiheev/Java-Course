package Lesson6.CustomerBase;

import java.util.PriorityQueue;

/**
 * Created by Alexey on 16.09.2015.
 */
public class Address {
    private String city;
    private String street;
    private int houseNumber;
    private int flatNumber;

    public Address() {}
    public Address(String city, String street, int houseNumber, int flatNumber){
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }
}
