package OOP.Task7;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setAge(34);
        person.setName("Vasya");
        person.setGender("M");
        person.setYearOfBirth(1985);

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getGender());
        System.out.println(person.getYearOfBirth());
    }
}
