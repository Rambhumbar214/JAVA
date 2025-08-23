package assignment2;

public class Person {
    public String name;
    public String city;

    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
    }
}