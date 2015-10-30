package Compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by student on 10/30/2015.
 */
public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        String p1Name = p1.getName()+ " " +p1.getCountry();
        String p2Name = p2.getName()+ " " +p2.getCountry();
        return p1Name.compareTo(p2Name);
    }

    public static void main(String[] args){
        List<Person> myList = new ArrayList();

        myList.add(new Person("Robert","USA"));

        myList.add(new Person("Robert","UK"));

        myList.add(new Person("Robert","India"));

        Collections.sort(myList, new PersonComparator());

        for(Person person : myList) {

            System.out.println("My name is " + person.getName() + " " +

                    person.getCountry());
        }

    }
}
