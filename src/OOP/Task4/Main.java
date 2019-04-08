package OOP.Task4;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Tuzik");
        dog.setAge(5);

        Person person = new Person();
        person.setName("Vasya");
        person.setAge(34);
        person.setGender("M");
        person.setYearOfBirth(1985);

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getGender());
        System.out.println(person.getYearOfBirth());

        System.out.println();
        person.setDog(dog);
        System.out.println(person.getDog().name);
        System.out.println(person.getDog().getAge());
    }
}
