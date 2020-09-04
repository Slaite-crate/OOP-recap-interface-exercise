package dk.kea.dat19c;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        //opgave: erstat HashSet, så vi får Persons ud i sorteret orden

        Set<Person> persons = new TreeSet<>();

        // Lav personer og indsæt i persons
        persons.add(new Person("Georgina", 175));
        persons.add(new Person("Anna", 163));
        persons.add(new Person("Marcus", 187));
        persons.add(new Person("Frederik", 169));
        persons.add(new Person("Frederik", 170));

        //udskriv personlisten i sorteret orden - kræver anden datatype for persons
        for (Person o : persons) System.out.println(o);
    }
}
