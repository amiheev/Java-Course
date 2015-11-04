package Parking;

/**
 * Created by Alexey on 03.11.2015.
 */
public class Car {
    private String gosNumber;


    @Override
    public String toString() {
        return "Car{" +
                "gosNumber='" + gosNumber + '\'' +
                '}';
    }

    public String getGosNumber() {
        return gosNumber;
    }

    private void setGosNumber(String gosNumber) {
        this.gosNumber = gosNumber;
    }



    public Car(){}

    public Car(String gosNumber) {
        setGosNumber(gosNumber);

    }

}
