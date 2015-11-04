package Parking;

/**
 * Created by Alexey on 03.11.2015.
 */
public class TestParking {
    public static void main(String[] args){
        ParkingArrayList parkingArrayList = new ParkingArrayList();
        Car bmw = new Car("123");
        Car audi = new Car("321");
        Car bmw1 = new Car("222");
        Car bmw2 = new Car("114");
        Car mersedes = new Car("522");
        Car lanos = new Car("123");
        parkingArrayList.carEnter(bmw);
        parkingArrayList.carEnter(audi);
        parkingArrayList.carEnter(bmw1);
        parkingArrayList.carEnter(bmw2);
        parkingArrayList.carEnter(mersedes);
        parkingArrayList.carEnter(lanos);
        parkingArrayList.carExit(bmw);
        parkingArrayList.carExit(bmw1);
        parkingArrayList.carExit(lanos);
        parkingArrayList.carEnter(bmw1);


        for (int i = 0; i < parkingArrayList.autoParking.size(); i++){
            System.out.println("Номер парковочного места " + i + " , гос номер автомобиля " + parkingArrayList.autoParking.get(i).getGosNumber());
        }

    }

}
