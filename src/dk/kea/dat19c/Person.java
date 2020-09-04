package dk.kea.dat19c;

public class Person implements Comparable<Person> {
    String name;
    int height;

    public Person(String name, int height)
    {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Navn: " + name + " Højde: " + height;
    }

    @Override
    public int compareTo(Person person) {
        if (this.name.toLowerCase().compareTo(person.getName()) != 0) {
            return this.name.compareTo(person.getName());
        } else {
            return this.height - person.getHeight();
        }
    }
}
