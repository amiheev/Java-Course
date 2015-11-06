package Hash;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Alexey on 04.11.2015.
 */
public class Cache   {
    private Hashtable<Integer, String> cacheTable;
    Timer timer;
    private int capacity;
    public Cache(int capacity){
        this.capacity = capacity;
        this.cacheTable = new Hashtable<>(capacity);

    }

    public int getCapacity(){
        return this.capacity;
    }

    // получитть значение по ключу
    public String getValueByKey(Integer key){
         return cacheTable.get(key);

    }


    // получить все ключи
    public Collection getAllKeys(){
        return cacheTable.keySet();
    }



    public void addKeyValue(Integer key, String value){
        try {
            int size = this.cacheTable.size();
            if (size >= getCapacity()){
                throw new IndexOutOfBoundsException();
            }else {
                this.cacheTable.put(key, value);
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("Cache is full");
        }



    }
    public void addKeyValue(Integer key, String value, int seconds){
        try {
            int size = this.cacheTable.size();
            if (size >= getCapacity()){
                throw new Exception();
            }else {
                this.timer = new Timer();
                this.cacheTable.put(key, value);
                timer.schedule(new RemovingObjects(key), seconds * 1000);
            }
        }catch (Exception e) {
            System.out.println("Cache is full");
        }

    }



    public void printTable(){
        System.out.println(this.cacheTable.entrySet());
    }

    class RemovingObjects extends TimerTask {
        int key;
        public RemovingObjects(int key){
            this.key = key;
        }
        @Override
        public void run() {
            cacheTable.remove(key);
            printTable();
        }
    }



}
