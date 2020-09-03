package dk.kea.dat19c;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        //opgave: erstat HashSet, så vi får Persons ud i sorteret orden

        Set<Person> persons = new HashSet<>();

        // Lav personer og indsæt i persons
        persons.add(new Person("Georgina", 175));
        persons.add(new Person("Anna", 163));
        persons.add(new Person("Marcus", 187));
        persons.add(new Person("Frederik", 169));

        //udskriv personlisten i sorteret orden - kræver anden datatype for persons
        System.out.println(persons);

    }

}
