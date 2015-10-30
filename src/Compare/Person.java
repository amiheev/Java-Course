package Compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {

    public String name;

    public String country;

    public Person(String name, String country) {

        this.name = name;

        this.country = country;

    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int compareTo(Person p) {
        return this.name.compareTo(p.getCountry()
        );
    }

    public static void main(String arg[]) {

        List<Person> myList = new ArrayList();

        myList.add(new Person("Robert", "USA"));

        myList.add(new Person("Andy", "UK"));

        myList.add(new Person("Harish", "India"));

        Collections.sort(myList);

        for (Person person : myList){
            System.out.println("My name is " + person.getName());
        }


        for(Person person : myList) {

            System.out.println("My name is " + person.getName() + " " +

                    person.getCountry());
        }



    }
}



