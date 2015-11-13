package Collection;

import java.util.*;

/**
 * Created by student on 11/3/2015.
 */
public class ArrayListDemo {
    public static void main(String[] args){
        List<String> list = new LinkedList<>();
        System.out.println(list.size());
        list.add("abc");
        list.add(("abc"));



        System.out.println("ALL IN LIST" + list);

        System.out.println("iterating list");
        ListIterator itr = list.listIterator();
        
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        while (itr.hasPrevious()){
            System.out.println(itr.previousIndex());
        }
        System.out.println("For each list");
        for (Object str : list){
            System.out.println(str);
        }
    }


}
