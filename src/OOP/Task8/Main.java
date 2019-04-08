package OOP.Task8;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Vasya");
        Dog dog = new Dog();
        person.setName("Petya");
        person.setAge(31);
        person.setGender("M");
        dog.setName("Sharik");
        dog.setAge(3);

        person.setDog(dog);

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getGender());
        System.out.println();
        System.out.println(person.getDog().getName());
        System.out.println(person.getDog().getAge());

    }
}
