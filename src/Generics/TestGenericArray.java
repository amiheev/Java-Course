package Generics;

/**
 * Created by student on 10/30/2015.
 */
public class TestGenericArray {
    public static void main(String[] args){
        Double[] doublArray = {1.1, 2.2, 3.3, 4.4};
        Byte[] byteArray = {1,2,3,4,5};
        Integer[] integerArray = {1,2,3,4,5};
        Long[] longArray = {1L,3L,6L,7L};
        GenericArray genericArray = new GenericArray();
        genericArray.setGenericArray(byteArray);
        System.out.println(genericArray.maxGenericArrayNumber());
        genericArray.setGenericArray(integerArray);
        System.out.println(genericArray.maxGenericArrayNumber());
        genericArray.setGenericArray(longArray);
        System.out.println(genericArray.maxGenericArrayNumber());
        genericArray.setGenericArray(doublArray);
        System.out.println(genericArray.maxGenericArrayNumber());
    }
}
