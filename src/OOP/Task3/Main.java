package OOP.Task3;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.name = "Vasya";
        person.age = 12;
        person.gender= "M";
        person.yearOfBirth = 1981;

        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.gender);
        System.out.println(person.yearOfBirth);
    }
}
