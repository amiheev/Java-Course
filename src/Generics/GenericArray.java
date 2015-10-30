package Generics;

/**
 * Created by student on 10/30/2015.
 */
public class GenericArray<T extends Number>{
    private T[] array;

    public GenericArray(){}

    public GenericArray(T array[]){
        setGenericArray(array);
    }

    public void setGenericArray(T array[]){
        this.array = array;
    }

    public T maxGenericArrayNumber(){
        T max = array[0];
        for (int i = 1; i < array.length; i++){
            if (max.doubleValue() < array[i].doubleValue()){
                max = array[i];
            }
        }
        return max;
    }




}
