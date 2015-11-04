package Hash;

/**
 * Created by Alexey on 04.11.2015.
 */
public class TestCache {
    public static void main(String [] args){
        Cache cache = new Cache(10);
        cache.addKeyValue(1, "A", 10);
        cache.addKeyValue(2, "B");
        cache.addKeyValue(3, "C");
        cache.addKeyValue(4, "D");
        cache.addKeyValue(5, "E");
        cache.addKeyValue(6, "F");
        cache.addKeyValue(7, "G");
        cache.addKeyValue(8, "H");
        cache.addKeyValue(9, "J");
        cache.addKeyValue(10, "K");
        cache.addKeyValue(11, "L", 10);
        System.out.println(cache.getAllKeys());
    }


}
