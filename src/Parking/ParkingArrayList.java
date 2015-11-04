package Parking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexey on 03.11.2015.
 */
public class ParkingArrayList {
    List<Car> autoParking = new ArrayList<>();

    public void carEnter(Car car){
        int placeIndex = nearPlace(car);
        if (placeIndex == -1){
            autoParking.add(car);
        }else autoParking.set(placeIndex, car);

    }

    public void carExit(Car car){
        int index = autoParking.indexOf(car);
        autoParking.set(index, new Car ("Свободно"));

    }

    public int nearPlace(Car car){
        int index = autoParking.indexOf(car.getGosNumber().contains("Свободно"));
        return index;
    }
}
