package Collection;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by student on 11/6/2015.
 */
public class DemoTreeSet {
    public static void main(String[] args) {

        ArrayList<Message> c = new ArrayList<Message>();

        boolean b;

        for (int i = 0; i < 6; i++)
            c.add(new Message(new StringBuilder((int) (Math.random() * 71) + "Y "),i));
            System. out.println(c + "list");

        TreeSet<Message> set = new TreeSet<Message>(c);

        System. out.println(set + "set");

        b = set.add(new Message(new StringBuilder("5 Element"), 4)); // addition(b=true)

        b = set.add(new Message(new StringBuilder("5 Element"), 4)); // addition(b=false)

        System. out.println(set + "add");

        System. out.println(set.comparator()); //null !!!

        System. out. println(set.last() + " | " + set.first());


    }
}
